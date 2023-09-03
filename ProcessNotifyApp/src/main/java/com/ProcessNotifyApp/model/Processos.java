
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProcessNotifyApp.model;


import jakarta.persistence.*;
import lombok.Data;

/**
 *
 * @author leosc
 */
@Data
@Entity
@Table(name = "processos_pje")
public class Processos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "numero_processo")
    private String numeroProcesso;
    @Column(name = "nome")
    private String nome;
    @Column(name = "documento")
    private String documento;
    @Column(name = "email")
    private String email;
    @Column(name = "cep")
    private String cep;
    @Column(name = "notificado")
    private boolean notificado;

}
    

