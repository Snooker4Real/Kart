package com.hb.kart.pojos;

public class Client {

    private static int inc = 1;

    private int id;
    private String nom;
    private String prenom;

    //Constructor

    public Client() {
    }

    public Client(String nom, String prenom) {
        this.id = inc++;
        this.nom = nom;
        this.prenom = prenom;
    }

    //Get & set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
