package com.example.support_queue_system;

import com.example.support_queue_system.config.DotenvInitializerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SupportQueueSystemApplication {
	public static void main(String[] args) {
		//SpringApplication.run(SupportQueueSystemApplication.class, args);
        SpringApplication app = new SpringApplication(AppApplication.class);
        app.addInitializers(new DotenvInitializerConfig());
        app.run(args);
	}
}
