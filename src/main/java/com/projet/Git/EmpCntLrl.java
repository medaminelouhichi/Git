package com.projet.Git;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Emp")

public class EmpCntLrl {
    Employes naji = new Employes( "naji","homme", 45 );
    @GetMapping("/naji")
    public String naji() {
        return naji.toString();
    }
}
