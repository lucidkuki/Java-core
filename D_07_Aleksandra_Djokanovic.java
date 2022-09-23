package com.itbootcamp.bgQA.drugaNedelja;

import java.util.Arrays;
import java.util.Scanner;

public class D_07_Aleksandra_Djokanovic {
    public static void main(String[] args) {
        Scanner mojSkener = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int duzinaNiza = mojSkener.nextInt(); //duzina niza
        String[] imena = new String[duzinaNiza];

        //zabranjuje korisniku da unese duzinu niza manju od dva (2)
        if (duzinaNiza == 0 || duzinaNiza == 1) {
            System.out.println("Minimalna duzina niza je dva(2)! Ponovo pokrenite program.");
            return;
        }
//dobijam niza sa imenima
        for (int i = 0; i < duzinaNiza; i++) {
            System.out.println("Unesite " + i + ". ime: ");
            imena[i] = mojSkener.next();
            imena[i] = imena[i].toUpperCase();
        }

        System.out.println(Arrays.toString(imena));


        int brojImenaNaSlovoM = 0;// broji koliko reci pocinje na slovo "M"

        String trazeniKarakter = "M";

//brojac se poveza za jedan ukoliko ime pocinje na "M"
        for (int i = 0; i < duzinaNiza; i++) {
            if (imena[i].startsWith(trazeniKarakter)) {
                brojImenaNaSlovoM++;

            }
        }
        String[] nizSaImenimaKojaPocinjuNaSlovoM = new String[brojImenaNaSlovoM]; //niz sa imenima koja pocinju na "M
//
        for (int i = 0, j = 0; i < duzinaNiza; i++) {
            if (imena[i].startsWith(trazeniKarakter)) {
                nizSaImenimaKojaPocinjuNaSlovoM[j] = imena[i];
                j++;

            }


        }

        System.out.println(Arrays.toString(nizSaImenimaKojaPocinjuNaSlovoM));
    }
}
