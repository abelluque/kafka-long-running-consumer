package com.redhat.longrunning.kafkacontainer;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.config.KafkaListenerEndpointRegistry;
import org.springframework.kafka.listener.MessageListenerContainer;
import org.springframework.stereotype.Service;


@Service
public class KafkaContainerSupportMethods {

	@Autowired
    private KafkaListenerEndpointRegistry registry;

    public void pauseConsume(String containerId) {
        getContainer(containerId).ifPresent(MessageListenerContainer::pause);
    }

    public void resumeConsumer(String containerId) {
        getContainer(containerId).ifPresent(MessageListenerContainer::resume);
    }


    private Optional<MessageListenerContainer> getContainer(String containerId) {
        return Optional.ofNullable(registry.getListenerContainer(containerId));
    }
}
