/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProcessNotifyApp.repository;

import com.ProcessNotifyApp.model.Processos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author leosc
 */
@Repository
public interface ProcessosJpaRepository extends JpaRepository<Processos, Integer> { 
    List<Processos> findByNotificadoTrue();
    
    List<Processos> findByNotificadoFalse();
 
}

