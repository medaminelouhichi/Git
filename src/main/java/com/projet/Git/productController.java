package com.projet.Git;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/product")
public class productController {

    product product = new product(3,"phone","phone",200);



    @GetMapping("/medAmine")
    public ResponseEntity<String> getMedAmineAifia(){
        return ResponseEntity.ok(product.toString());
    }
}
