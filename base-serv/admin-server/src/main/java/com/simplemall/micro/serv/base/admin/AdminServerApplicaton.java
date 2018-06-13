package com.simplemall.micro.serv.base.admin;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 * 入口方法
 * 
 * @author guooo
 *
 */
@EnableAdminServer //开启Spring Boot Admin 服务
@SpringBootApplication
@EnableDiscoveryClient
public class AdminServerApplicaton {

	public static void main(String[] args) {
		SpringApplication.run(AdminServerApplicaton.class, args);
	}


}
