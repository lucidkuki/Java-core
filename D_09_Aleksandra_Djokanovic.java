package com.itbootcamp.bgQA.trecaNedelja;

import java.util.Scanner;

public class D_09_Aleksandra_Djokanovic {
    public static void main(String[] args) {
        Scanner mojSkener = new Scanner(System.in);
        System.out.println("Unesite ceo broj: ");
        int korisnikovBroj = mojSkener.nextInt();
        faktorijal(korisnikovBroj);


    }

    public static int faktorijal(int korisnikovBroj){
        int rezultat =1;

        for (int i =korisnikovBroj;i<=korisnikovBroj;i--){
            if (i==1){
                rezultat*=i;
                break;
            }
            rezultat*=i;
        }
        System.out.println("Rezultat je: "+rezultat);
        return rezultat;
    }
}
