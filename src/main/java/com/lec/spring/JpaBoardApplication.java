package com.lec.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing   // 스프링의 기본 listener 동작시키기
public class JpaBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaBoardApplication.class, args);
	}

}
