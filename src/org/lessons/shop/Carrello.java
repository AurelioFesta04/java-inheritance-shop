package org.lessons.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanti prodotti vuoi inserire nel carrello?");
        int numProdotti = scanner.nextInt();

        Prodotto[] prodotti = new Prodotto[numProdotti];

        for (int i = 0; i < numProdotti; i++) {

            System.out.println("Che tipo di prodotto vuoi inserire? (1)Smartphone (2)Televisore (3)Cuffie");
            int tipoProdotto = scanner.nextInt();

            System.out.println("Inserisci il nome");
            String nome = scanner.next();

            System.out.println("Inserisci la marca");
            String marca = scanner.next();

            System.out.println("Inserisci il prezzo");
            BigDecimal prezzo = scanner.nextBigDecimal();

            switch (tipoProdotto) {
                case 1:
                    System.out.println("Inserisci l'IMEI");
                    String imei = scanner.next();

                    System.out.println("Inserisci la memoria");
                    String memoria = scanner.next();

                    Smartphone smartphone = new Smartphone(nome, marca, prezzo, imei, memoria);
                    prodotti[i] = smartphone;

                    System.out.println(smartphone.toString());

                    break;
                case 2:
                    System.out.println("Inserisci le dimensioni");
                    String dimensioni = scanner.next();

                    System.out.println("Il televisore è smart? (true/false)");
                    Boolean smart = scanner.nextBoolean();

                    Televisori tv = new Televisori(nome, marca, prezzo, dimensioni, smart);
                    prodotti[i] = tv;

                    System.out.println(tv.toString());

                    break;
                case 3:
                    System.out.println("Inserisci i colori");
                    String colori = scanner.next();

                    System.out.println("Le cuffie sono cablate? (true/false)");
                    boolean cablate = scanner.nextBoolean();

                    Cuffie cuffie = new Cuffie(nome, marca, prezzo, colori, cablate);
                    prodotti[i] = cuffie;

                    System.out.println(cuffie.toString());

                    break;
            }


        }

        scanner.close();

        System.out.println("Ecco i prodotti inseriti nel carrello:");

        for (int i=0; i<numProdotti; i++) {
            System.out.println(prodotti[i]);
        }
    }
}