package com.redhat.longrunning.tasks;

import java.time.Duration;

import org.springframework.stereotype.Service;


@Service
public class LongRunningJob {
    public void run(String event) {
    	try {
			System.out.println("Starting long running job the pause container way for event {}"+ event);

			Thread.sleep(Duration.ofMinutes(1).toMillis());

			System.out.println("Done with long running job the pause container way for event {}"+ event);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
}
