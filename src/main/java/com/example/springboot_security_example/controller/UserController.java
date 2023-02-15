package com.example.springboot_security_example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @GetMapping("/index")
    public String getMessage() {
        return "Index Sayfası Hoş Geldiniz";
    }


    @GetMapping("/dashboard")
    public String getDash() {
        return "Login Başarılı Hoş Geldiniz";
    }

    @GetMapping("/admin")
    public String getAdmin() {
        return "Admin Sayfası";
    }
}
