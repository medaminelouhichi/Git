package com.projet.Git;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class product {

    private int id;
    private String name;
    private String description;
    private int price;

    public product() {}

    public product(int id, String name, String description, int price) {}

    public String toString(){
        return this.id + " " + this.name + " " + this.description + " " + this.price;
    }

}
