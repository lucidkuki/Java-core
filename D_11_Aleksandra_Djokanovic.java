package com.itbootcamp.bgQA.trecaNedelja;

import java.util.Arrays;
import java.util.Scanner;

public class D_11_Aleksandra_Djokanovic {
    public static void main(String[] args) {
        stampanjeImena(3);

    }


    public static String[] stampanjeImena(int brojImena) {
        Scanner mojSkener = new Scanner(System.in);
        String[] imena = new String[brojImena];


        for (int i = 1, j = 0; i <= brojImena; i++, j++) {
            System.out.println("Unesite " + i + ". ime:");
            imena[j] = mojSkener.next();
        }

        System.out.println(Arrays.toString(imena));
        return imena;
    }


}
