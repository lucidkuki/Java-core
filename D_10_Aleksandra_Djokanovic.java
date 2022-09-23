package com.itbootcamp.bgQA.trecaNedelja;

import java.util.Scanner;

public class D_10_Aleksandra_Djokanovic {
    public static void main(String[] args) {
        Scanner mojSkener = new Scanner(System.in);
        System.out.println("Unesite rec: ");
        String prvaRec = mojSkener.next();
        prvaRec = prvaRec.toLowerCase();
        System.out.println("Unesite drugu rec: ");
        String drugaRec = mojSkener.next();
        drugaRec = drugaRec.toLowerCase();
        String samoglasnici = "";

        if (prvaRec.length() == drugaRec.length()) {
            System.out.println("Reci su iste duzine.");
            for (int i = 0; i < prvaRec.length(); i++) {
                if (prvaRec.charAt(i) == 'a' || prvaRec.charAt(i) == 'e' || prvaRec.charAt(i) == 'i' || prvaRec.charAt(i) == 'o' || prvaRec.charAt(i) == 'u') {
                    samoglasnici += prvaRec.charAt(i) ;
                }

            }
            for (int i = 0; i < prvaRec.length(); i++) {
                if (drugaRec.charAt(i) == 'a' || drugaRec.charAt(i) == 'e' || drugaRec.charAt(i) == 'i' || drugaRec.charAt(i) == 'o' || drugaRec.charAt(i) == 'u') {
                    samoglasnici += drugaRec.charAt(i) ;
                }

            }

            System.out.println("Samoglasnici su: " + samoglasnici);
        } else {
            System.out.println("Reci nisu iste duzine.");

        }

    }
}
