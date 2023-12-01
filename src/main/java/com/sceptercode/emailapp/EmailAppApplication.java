package com.sceptercode.emailapp;

import com.sceptercode.emailapp.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailAppApplication {
    @Autowired
    private EmailSenderService emailSenderService;

    public static void main(String[] args) {
        SpringApplication.run(EmailAppApplication.class, args);
    }
    @EventListener(ApplicationReadyEvent.class)
    public void sendMail() {
        emailSenderService.send("ebukachukwunenyeebuka@gmail.com",
                "Employment Letter",
                "You have been employed by Chevron Corporation Mr Ebuka Henry Chukwunenye");
    }
}
