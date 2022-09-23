package com.itbootcamp.bgQA.drugaNedelja;

import java.util.Scanner;

public class D_04_Aleksandra_Djokanovic {
    public static void main(String[] args) {

        Scanner mojSkener = new Scanner(System.in);
        System.out.print("Unesite neki broj: ");
        double unetiBroj = mojSkener.nextInt();
        unetiBroj = Math.abs(unetiBroj);
        double sumaKvadrata = 0;

        for (int i = 0; i <= unetiBroj; i++) {
            if (unetiBroj == 0) {
                System.out.println("Izasli ste iz programa.");
                break;
            }
            if (i % 2 == 0) {
                continue;
            } else {
                sumaKvadrata = sumaKvadrata + Math.pow(i, 2.0);

            }

        }
        int novaSumaKvadrata = (int) sumaKvadrata;
        System.out.print("Suma kvadrata neparnih brojeva je: " + novaSumaKvadrata);
    }
}
