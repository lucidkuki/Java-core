package com.itbootcamp.bgQA.drugaNedelja;

import java.util.Scanner;

public class D_01_Aleksandra_Djokanovic {
    public static void main(String[] args) {

        Scanner mojSkener = new Scanner(System.in);
        System.out.print("Unesite prvi broj: ");
        int prviBroj = mojSkener.nextInt();
        prviBroj = Math.abs(prviBroj);
        System.out.print("Unesite drugi broj: ");
        int drugiBroj = mojSkener.nextInt();
        drugiBroj = Math.abs(drugiBroj);
        int proizvod = 0;

        while (drugiBroj>0){
            proizvod+=prviBroj;
            drugiBroj--;
        }
        System.out.print("Proizvod ova dva broja je: "+proizvod);

    }
}
