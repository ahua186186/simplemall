package com.simplemall.micro.serv.base.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
/**
 * 入口方法
 * 
 * @author guooo
 *
 */
@Configuration
@EnableAdminServer //开启Spring Boot Admin 服务
@SpringBootApplication
@EnableDiscoveryClient
public class AdminServerApplicaton {

	public static void main(String[] args) {
		SpringApplication.run(AdminServerApplicaton.class, args);
	}


}
