package com.hb.kart.pojos;

public class Kart {

    private String immatriculation;

    //Constructor

    public Kart() {
    }

    public Kart(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    //Get & set
    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    @Override
    public String toString() {
        return "Kart{" +
                "immatriculation='" + immatriculation + '\'' +
                '}';
    }
}
