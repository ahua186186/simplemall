package com.simplemall.micro.serv.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * spring config server
 * 
 * @author guooo
 *
 */
@SpringBootApplication
@EnableConfigServer
//配置本应用注册为服务，这样客户端就可以通过服务发现的方式自动负载均衡
@EnableDiscoveryClient
public class ConfigServerApplication {
	
	// FIXME encrypt配置文件
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
