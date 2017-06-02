# FreemarkerEmailSample
Spring Boot - Sending email with freemarker template

# Overview
Apache FreeMarker is a template engine: a Java library to generate text output (HTML web pages, e-mails, configuration files, source code, etc.) based on templates and changing data. Templates are written in the FreeMarker Template Language (FTL), which is a simple, specialized language (not a full-blown programming language like PHP). You meant to prepare the data to display in a real programming language, like issue database queries and do business calculations, and then the template displays that already prepared data. In the template you are focusing on how to present the data, and outside the template you are focusing on what data to present.. [ Read more ](http://freemarker.org/).


####	Dependencies (POM.xml)

```xml
<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-freemarker</artifactId>
		</dependency>
  <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-mail</artifactId>            
        </dependency>
	</dependencies>
```
####	configuration
in application.properties files
spring.main.banner-mode=off

#email
email.host=smtp.gmail.com
email.port=587
email.username=your_smtp_email_sender
email.password=your_smtp_password_sender
