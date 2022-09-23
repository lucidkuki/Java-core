package com.itbootcamp.bgQA.drugaNedelja;

public class D_03_Aleksandra_Djokanovic {
    public static void main(String[] args) {
        String unetaRec = "ITBootCamp";
        unetaRec = unetaRec.toUpperCase();

        for (int i=0;i<unetaRec.length();i++){

            if (unetaRec.charAt(i)!='C'){
                System.out.print(unetaRec.charAt(i));

            }
        }




    }
}
