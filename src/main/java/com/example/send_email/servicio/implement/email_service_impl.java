package com.example.send_email.servicio.implement;

import com.example.send_email.servicio.send_email_service;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;



@Service


public class email_service_impl implements send_email_service {

    private final JavaMailSender mailSender;

    public email_service_impl(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    @java.lang.Override
    public void Send_email(String para, String asunto, String mensaje) {

        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("");
        simpleMailMessage.setTo(para);
        simpleMailMessage.setSubject(asunto);
        simpleMailMessage.setText(mensaje);

        this.mailSender.send(simpleMailMessage);

    }
}
