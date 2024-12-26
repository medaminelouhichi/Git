package com.projet.Git;

import com.projet.Git.Client;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/clients")
public class ClientController {

    Client bechir = new Client(2,"Ferjani","Bechir");


    @GetMapping("/bechir")
    public ResponseEntity<Client> getClients() {
        return ResponseEntity.ok(bechir);
    }
}