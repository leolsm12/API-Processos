    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProcessNotifyApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author leosc
 */
@RestController
public class WelcomeController {
    @GetMapping
    public String Welcome(){
        return "Welcome to my Spring boot API";
    
    }
}
