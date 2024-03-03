package com.boot.auth.jwt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/")
    public ResponseEntity<String> home(){
        return new ResponseEntity<>("Welcome to home", HttpStatus.OK);
    }

    @GetMapping("/authenticated")
    public ResponseEntity<String> homeAuthenticated(Principal principal){
        return new ResponseEntity<>("Welcome to home \""+principal.getName()+"\" buddy", HttpStatus.OK);
    }


}
