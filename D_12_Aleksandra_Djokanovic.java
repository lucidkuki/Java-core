package com.itbootcamp.bgQA.trecaNedelja;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class D_12_Aleksandra_Djokanovic {
    public static void main(String[] args) {
        String[] imenaFiksna = {"Nikola","Marko","Ana"};
        unija(4);


    }

    public static void unija(int brojImena) {
        Scanner mojSkener = new Scanner(System.in);
        String[] imena = new String[brojImena];
        String[] imenaFiksna = {"Nikola","Marko","Ana"};
        for (int i = 1, j = 0; i <= brojImena; i++, j++) {
            System.out.println("Unesite " + i + ". ime:");
            imena[j] = mojSkener.next();
        }

        System.out.println("Korisnik je uneo sledeca imena: "+Arrays.toString(imena));

        Set<String> unijaImena = new HashSet<>(); //
        unijaImena.addAll(Arrays.asList(imenaFiksna));
        unijaImena.addAll(Arrays.asList(imena));

        String[] unijaImenaNiz = {};
        unijaImenaNiz = unijaImena.toArray(unijaImenaNiz);
        System.out.println("Fiksna imena su: "+imenaFiksna);
        System.out.println("Unija ova dva niza je: "+ Arrays.toString(unijaImenaNiz));
    }
}
