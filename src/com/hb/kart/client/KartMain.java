package com.hb.kart.client;

import com.hb.kart.iterators.CollectionDeClients;
import com.hb.kart.pojos.Client;

import java.util.Iterator;
import java.util.Scanner;

public class KartMain {

    private static Scanner sc = new Scanner(System.in);
    private static CollectionDeClients collectionDeClients = new CollectionDeClients();
    public static void main(String[] args) {

        int choix = 0;

        while(choix != 5){
            afficherMenu();
            choix = choixMenu();
            switch (choix){
                case 1:
                    ajouterClient();
                    break;
                case 2:
                    afficherClient();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        }
        sc.close();
        //Client client1 = new Client();
    }

    public static void afficherMenu(){
        System.out.println("***** BIENVENU DANS LE GESTIONNAIRE DE KARTING *****");
        System.out.println("");
        System.out.println("1. Ajouter un client");
        System.out.println("2. Voir les clients");
        System.out.println("3. Ajouter une participation");
        System.out.println("4. Voir les participations");
        System.out.println("5. Quitter");
    }

    public static int choixMenu(){
        int choix = 0;

        System.out.println("Saisir un choix : ");
        try {
            choix = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Saisissez un nombre !");
        }

        return  choix;
    }

    public static void afficherClient(){
        for(Iterator it = collectionDeClients.iterator(); collectionDeClients.hasNext();){
            Client client = collectionDeClients.next();

            System.out.println(client);
        }
    }

    public static void ajouterClient(){
        System.out.println("Entrez un nom: ");
        String nom = sc.nextLine();
        System.out.println("Entre un prénom: ");
        String prenom = sc.nextLine();

        Client client = new Client(nom, prenom);
        collectionDeClients.add(client);
    }
}

