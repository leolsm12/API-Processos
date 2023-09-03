/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Notify.App.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

/**
 *
 * @author leosc
 */
@Data
@JacksonXmlRootElement(localName = "processo")
public class Processo {
    @JacksonXmlProperty(localName = "id")
    private int id;

    @JacksonXmlProperty(localName = "numeroProcesso")
    private String numeroProcesso;

    @JacksonXmlProperty(localName = "nome")
    private String nome;
    
    @JacksonXmlProperty(localName = "documento")
    private String documento;

    @JacksonXmlProperty(localName = "email")
    private String email;

    @JacksonXmlProperty(localName = "cep")
    private String cep;

    @JacksonXmlProperty(localName = "notificado")
    private boolean notificado;

}
