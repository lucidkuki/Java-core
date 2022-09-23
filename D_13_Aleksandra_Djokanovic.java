package com.itbootcamp.bgQA.trecaNedelja;

import java.util.Scanner;

public class D_13_Aleksandra_Djokanovic {
    public static void main(String[] args) {
        unijaElemenata();
    }

    public static String[] unijaElemenata() {
        Scanner skener = new Scanner(System.in);
        System.out.print("Unesite duzinu prvog niza: ");
        int duzinaPrvogNiza = skener.nextInt();
        String[] prviNiz = new String[duzinaPrvogNiza];
        for (int i = 0, j = 0; i < duzinaPrvogNiza; i++, j++) {
            System.out.print("Unesite " + j + ". element niza: ");
            String input = skener.next();
            prviNiz[i] = input;
        }
        System.out.print("Unesite duzinu drugog niza: ");
        int y = skener.nextInt();
        String[] drugiNiz = new String[y];
        for (int i = 0, j = 0; i < y; i++, j++) {
            System.out.print("Unesite " + j + ". element niza: ");
            String input = skener.next();
            drugiNiz[i] = input;
        }
        int brojIstihImena = 0;
        for (int i = 0; i < duzinaPrvogNiza; i++) {
            for (int j = 0; j < y; j++) {
                if (prviNiz[i].equalsIgnoreCase(drugiNiz[j])) {
                    brojIstihImena++;
                }
            }
        }
        String[] treciNiz = new String[duzinaPrvogNiza + y - brojIstihImena];
        int k = 0;
        for (int i = 0; i < duzinaPrvogNiza; i++) {
            boolean imena = false;
            for (int j = 0; j < y; j++) {
                if (prviNiz[i].equalsIgnoreCase(drugiNiz[j])) {
                    imena = true;
                }
            }
            if (imena) {
                continue;
            }
            treciNiz[k] = prviNiz[i];
            k++;
        }
        for (int i = k, l = 0; i < treciNiz.length; i++, l++) {
            treciNiz[i] = drugiNiz[l];
        }
        for (int i = 0; i < treciNiz.length; i++) {
            System.out.print(treciNiz[i]);
            if (i != (treciNiz.length) - 1) {
                System.out.print(", ");
            }
        }
        return treciNiz;
    }
}

