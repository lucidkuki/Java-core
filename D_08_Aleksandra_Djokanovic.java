package com.itbootcamp.bgQA.drugaNedelja;

import java.util.Arrays;
import java.util.Scanner;

public class D_08_Aleksandra_Djokanovic {
    public static void main(String[] args) {
        Scanner mojSkener = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int[] korisnikovNiz = new int[mojSkener.nextInt()];

//korisnik unosi svoj niz
        for (int i = 0; i < korisnikovNiz.length; i++) {
            System.out.println("Unesite" + i + ". clan niza: ");
            korisnikovNiz[i] = mojSkener.nextInt();
        }
        System.out.println("Korisnikov niz je: " + Arrays.toString(korisnikovNiz));

        System.out.println("Unesite koliko brojeva zelite da obrisete: ");
        int kolikoBrojevaSeBrise = mojSkener.nextInt();
        int[] brojeviKojiSeBrisu = new int[kolikoBrojevaSeBrise];
        int[] konacanNiz = new int[korisnikovNiz.length - brojeviKojiSeBrisu.length];

        for (int i = 0; i < kolikoBrojevaSeBrise; i++) {
            System.out.println("Unesite " + i + ". broj koji zelite da obrisete: ");
            brojeviKojiSeBrisu[i] = mojSkener.nextInt();
        }
        System.out.println("Brojevi koji se brisu su: " + Arrays.toString(brojeviKojiSeBrisu));


        // ---------- korisnikovNiz, brojeviKojiSeBrisu

        int brojElemenataRezNiza = 0;
        int[] medjuniz = new int[korisnikovNiz.length - brojeviKojiSeBrisu.length];
        for (int i = 0; i < korisnikovNiz.length; i++) {
            // proveravamo da li korisnikovNiz[i] pripada nizu brojeva koji se brisu
            boolean pripada = false;
            for (int j = 0; j < brojeviKojiSeBrisu.length; j++) {
                if (korisnikovNiz[i] == brojeviKojiSeBrisu[j]) {
                    pripada = true;
                    break;
                }
            }

            // sad odlucujemo sta da radimo ako pripada a sta ako ne pripada
            if (!pripada) {// smestanmo u medjuniz
                medjuniz[brojElemenataRezNiza] = korisnikovNiz[i];
                brojElemenataRezNiza++;
            }
        }

        int[] rezultat = new int[brojElemenataRezNiza];

        // prepisujemo iz medjuniza u rezultat
        for (int i = 0; i < brojElemenataRezNiza; i++) {
            rezultat[i] = medjuniz[i];
        }

        // -----------

        System.out.println("Konacan niz je: " + Arrays.toString(rezultat));
    }
}
