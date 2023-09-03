/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Notify.App.service;

import com.Notify.App.model.Processo;
import jakarta.mail.FetchProfile.Item;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author leosc
 */
@Service
public class ApiService {
    private final String API_URL = "http://localhost:8080/api/processos/nao-notificados"; // Substitua pela URL real da API
    private final RestTemplate restTemplate;

    @Autowired
    public ApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getDataFromApiAsString() {
        ResponseEntity<String> response = restTemplate.getForEntity(API_URL, String.class);

        if (response.getStatusCode().is2xxSuccessful()) {
            return response.getBody();
        } else {
            throw new RuntimeException("Erro ao consumir a API: " + response.getStatusCode());
        }
    }
    public List<Processo> getDataFromApi() {
    ResponseEntity<Processo[]> response = restTemplate.getForEntity(API_URL, Processo[].class);

        if (response.getStatusCode().is2xxSuccessful()) {
            List<Processo> processos = Arrays.asList(response.getBody());

          /*  // Verificar se algum "cep" está vazio
            for (Processo processo : processos) {
                if (processo.getCep() == null || processo.getCep().isEmpty()) {
                    System.out.println("Processo com cep vazio encontrado: " + processo.getId());
                        // Você pode tomar alguma ação aqui, se necessário
                    }
                }*/

            return processos;
        } else {
                throw new RuntimeException("Erro ao consumir a API: " + response.getStatusCode());
        }
    }
    
}
