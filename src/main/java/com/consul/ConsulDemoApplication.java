package com.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import com.consul.config.Config;

@EnableDiscoveryClient
@SpringBootApplication
@EnableConfigurationProperties({Config.class})//指定配置类
public class ConsulDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsulDemoApplication.class, args);
	}

}
