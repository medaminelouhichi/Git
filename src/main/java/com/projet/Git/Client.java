package com.projet.Git;

import java.util.ArrayList;

public class Client {
    public int id;
    public String nom;
    public String prenom;
    public static ArrayList<Client> clients = new ArrayList<Client>();

    public Client(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public String toString() {
        return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
    }

    public void addClient(Client client) {
        clients.add(client);
    }
}