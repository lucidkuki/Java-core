package com.itbootcamp.bgQA.drugaNedelja;

import java.util.Arrays;
import java.util.Scanner;

public class D_05_Aleksandra_Djokanovic {
    public static void main(String[] args) {
        Scanner mojSkener = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int duzinaNiza = mojSkener.nextInt();
        int[] mojNiz = new int[duzinaNiza]; //originalni niz
        int[] obrnutiRedosledNiz = new int[mojNiz.length]; //niz koji ce sadrzati obrnut redosled ima istu duzinu kao originalni niz
        //zabranjuje korisniku da unese duzinu niza manju od dva (2)


        if (duzinaNiza == 0 || duzinaNiza == 1) {
            System.out.println("Minimalna duzina niza je dva(2)! Ponovo pokrenite program.");
            return;
        }


        for (int i = 0; i < duzinaNiza; i++) {
            System.out.println("Unesite " + i + ". clan niza: ");
            mojNiz[i] = mojSkener.nextInt();
        }
        //i je indeks clanova originalnog niza i on se kroz iteracije povecava
        //j je indeks clanova obrnutog niza i on se kroz iteracije smanjuje pa je prvi clan obrnutog niza jednak poslednjem clanu originalnog
        //i tako redom...
        for (int i = 0, j = duzinaNiza - 1; i < obrnutiRedosledNiz.length; i++, j--) {
            obrnutiRedosledNiz[j] = mojNiz[i];
        }

        System.out.println("Obrnuti niz je: " + Arrays.toString(obrnutiRedosledNiz));


    }
}
