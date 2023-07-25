package com.redhat.longrunning.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.task.AsyncListenableTaskExecutor;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.redhat.longrunning.kafkacontainer.KafkaContainerSupportMethods;
import com.redhat.longrunning.tasks.LongRunningJob;




@Service
@KafkaListener(topics = "pause_container_topic", id = "${kafka.container.id}", idIsGroup = false)
public class Consumer {
	
	@Autowired
    private LongRunningJob longRunningJob;
	
	@Autowired
    private AsyncListenableTaskExecutor executor;
	
	@Autowired
    private KafkaContainerSupportMethods containerSupportMethods;

    @Value("${kafka.container.id}")
    private String containerId;

    @KafkaHandler
    public void handleEvent(@Payload String event) {
       System.out.println("Handling the event with body {} the pause container way"+ event);

        containerSupportMethods.pauseConsume(containerId);

        executor.submitListenable(() -> longRunningJob.run(event))
                .addCallback(result -> {
                            containerSupportMethods.resumeConsumer(containerId);
                            System.out.println("Success callback");
                        },
                        ex -> {
                            //perform retry mechanism like a dead letter queue here
                            containerSupportMethods.resumeConsumer(containerId);
                            System.out.println("Error callback");
                        }
                );
    }
}
