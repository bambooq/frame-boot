package com.newland.iot.mediaserver;

import com.newland.iot.mediaserver.config.MybatisConfig;
import com.newland.iot.mediaserver.config.SpringConfig;
import com.newland.iot.mediaserver.config.SpringMvcConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@Import(value={SpringConfig.class, SpringMvcConfig.class, MybatisConfig.class})
public class MediaServerApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MediaServerApplication.class, args);
	}
}
