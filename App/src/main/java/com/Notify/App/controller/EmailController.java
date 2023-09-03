/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Notify.App.controller;

import com.Notify.App.model.EmailRequest;
import com.Notify.App.service.EmailService;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author leosc
 */
@RestController
public class EmailController {
    @Autowired 
    private EmailService emailService;

    @PostMapping("/enviar-email")
    public ResponseEntity<EmailRequest>enviarEmail(@RequestBody EmailRequest request) throws MessagingException {
        String destinatario = request.getDestinatario();
        String assunto = request.getAssunto();
        String mensagem = request.getMensagem();

        emailService.enviarEmail(destinatario, assunto, mensagem);
        return null;
    }
    
}
