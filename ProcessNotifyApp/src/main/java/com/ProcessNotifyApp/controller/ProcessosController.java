/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProcessNotifyApp.controller;

import com.ProcessNotifyApp.model.Processos;
import com.ProcessNotifyApp.repository.ProcessosJpaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author leosc
 */
@RestController
@RequestMapping("/api/processos")
public class ProcessosController {
    @Autowired
    private ProcessosJpaRepository repository;
    @PostMapping("/post")
    public void postProcessos(@RequestBody Processos processos){
     repository.save(processos);   
    }
    @GetMapping("/all")
    public List<Processos> getProcessos(){
        return repository.findAll();
    }
    @GetMapping("/notificados")
    public List<Processos> findNotificados() {
    List<Processos> processosNotificados = repository.findByNotificadoTrue();
    return processosNotificados;
    }
    @GetMapping("/nao-notificados")
    public List<Processos> findNaoNotificados() {
    List<Processos> processosNaoNotificados = repository.findByNotificadoFalse();
    return processosNaoNotificados;
    }

}
