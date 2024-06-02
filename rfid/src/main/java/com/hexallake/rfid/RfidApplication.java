package com.hexallake.rfid;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class RfidApplication {

	public static void main(String[] args) {
		          ApplicationContext appCntxt = new SpringApplicationBuilder(RfidApplication.class)
                                                        .web(WebApplicationType.NONE)
                                                        .headless(false)
                                                        .bannerMode(Banner.Mode.OFF)
                                                        .run(args);
	}

}
