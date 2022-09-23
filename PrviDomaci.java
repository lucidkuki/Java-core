package com.itbootcamp.bgQA.prvaNedelja;

import java.util.Scanner;

public class PrviDomaci {
    public static void main(String[] args) {
        Scanner unosGodina=new Scanner(System.in);
        System.out.println("Unesite godinu pocetka rada");
        int godinaPocetkaRada=unosGodina.nextInt();
        int trenutnaGodina=2022;
        int godineRadnogIskustva=trenutnaGodina-godinaPocetkaRada;

        if (godineRadnogIskustva<=4){
            System.out.println("Ti si Junior programer.");
        }
        else if(godineRadnogIskustva<=8){
            System.out.println("Ti si Senior programer.");
        }
        else {
            System.out.println("Vi ste direktor firme.");
        }

//        Drugi zadatak

        Scanner unosVelicine=new Scanner(System.in);
        System.out.println("Unesite velicinu majice u cm");
        int velicinaMajice=unosVelicine.nextInt();

        switch (velicinaMajice){
            case 24:
            System.out.println("S velicina");
            break;
            case 30:
                System.out.println("M velicina");
                break;
            case 36:
                System.out.println("L velicina");
                break;
            case 42:
                System.out.println("XL velicina");
                break;
            default:
                System.out.println("Nepostojeca velicina");
        }
    }






}

