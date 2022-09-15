package com.example.send_email.controlador;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.send_email.resource.mensaje_email;
import com.example.send_email.servicio.send_email_service;

@RestController
public class controlador_email {

    private final send_email_service send_email_service;

    public controlador_email(com.example.send_email.servicio.send_email_service send_email_service) {
        this.send_email_service = send_email_service;
    }

    @PostMapping(" /Send-email")
    public ResponseEntity Send_email(@RequestBody mensaje_email emailmessage) {

        this.send_email_service.Send_email(emailmessage.getPara(),emailmessage.getAsunto(), emailmessage.getMensaje());
        return ResponseEntity.ok("exito");

    }

}
