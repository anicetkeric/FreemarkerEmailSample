package com.spring.freemarker;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.freemarker.bean.Mail;
import com.spring.freemarker.service.MailService;

@SpringBootApplication
public class FreemarkerEmailSampleApplication implements CommandLineRunner {

	@Autowired
	MailService mailService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(FreemarkerEmailSampleApplication.class, args);
	}
	

	@Override
	public void run(String... args) throws Exception {

		Mail mail = new Mail();
		mail.setMailFrom("anicetkeric@outlook.com");
		mail.setMailTo("anicetkeric@outlook.com");
		mail.setMailSubject("Spring Boot - Sending email with freemarker template");

		Map<String, Object> model = new HashMap<String, Object>();
		model.put("firstName", "David");
		model.put("lastName", "Pham");
		model.put("message", "message");
		model.put("recipient", "anicetkeric@outlook.com");
		mail.setModel(model);

		mailService.sendEmail(mail);

		System.out.println("Done!");

		//wait(0);
	}
}
