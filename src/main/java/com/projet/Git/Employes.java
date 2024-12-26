package com.projet.Git;

import java.security.PrivateKey;

public class Employes {
   private  String name;
    private String gender;
    int age;




    public Employes (String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
            }
    public String getName() {
        return name;
        }
        public void setName(String name) {
        this.name = name;
        }

    @Override
    public String toString() {
        return "Employes{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
