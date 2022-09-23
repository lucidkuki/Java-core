package com.itbootcamp.bgQA.drugaNedelja;

import java.util.Scanner;

public class D_02_Aleksandra_Djokanovic {
    public static void main(String[] args) {
        Scanner mojSkener = new Scanner(System.in);
        System.out.println("Unesite neku rec:");
        String unetaRec = mojSkener.next();
        unetaRec = unetaRec.toLowerCase();

        int brojac = 0; //ovde stoji koliko samoglasnika postoji u reci

        for (int i = 0; i < unetaRec.length(); i++) {

            if (unetaRec.charAt(i)=='a'||unetaRec.charAt(i)=='e'||unetaRec.charAt(i)=='i'||
            unetaRec.charAt(i)=='o'||unetaRec.charAt(i)=='u') {

                System.out.println(unetaRec.charAt(i) ); //stampa samoglasnike
                brojac++; //broji samoglasnike
            }
        }
        System.out.println("Ova rec ima: "+brojac+" samoglasnika");
    }
}
