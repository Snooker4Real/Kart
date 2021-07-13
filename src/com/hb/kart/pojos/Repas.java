package com.hb.kart.pojos;

public class Repas {
    private int id;
    private String nom;
    private double prix;
    private TypeRepas typeRepas;

    //Constructeur
    public Repas() {
    }
    public Repas(int id, String nom, double prix, TypeRepas typeRepas) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.typeRepas = typeRepas;
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

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public TypeRepas getTypeRepas() {
        return typeRepas;
    }

    public void setTypeRepas(TypeRepas typeRepas) {
        this.typeRepas = typeRepas;
    }

    @Override
    public String toString() {
        return "Repas{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                ", typeRepas=" + typeRepas +
                '}';
    }
}
