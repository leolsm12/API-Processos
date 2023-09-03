/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Notify.App.model;

import lombok.Data;

/**
 *
 * @author leosc
 */
@Data
public class EmailRequest {
    private String destinatario;
    private String assunto;
    private String mensagem;
}
