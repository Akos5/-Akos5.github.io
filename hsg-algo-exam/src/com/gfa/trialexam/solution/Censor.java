package com.gfa.trialexam.solution;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Censor {
    public static void main(String[] args) {
/*
    Készíts egy publikus függvényt `censor` névvel,
    amely három string-et (karakterláncot) kér paraméterként és egy string-gel tér vissza.
    Az első string (`text`) az a szöveg, amit a függvénynek meg kell majd változtatnia.
    A második string (`originalWord`) lesz az,
    amit minden előfordulása során a harmadik string-re (`newWord`) kell megváltoztatni.
    A függvénynek térjen vissza a módosított string-el.
    Fontos, hogy nem használhatod egyik beépített helyettesítő függvényt sem!

    Példa:

    censor("A kedvenc gyümölcsöm a(z) alma", "alma", "banán");

    Amivel vissza kell térnie: `"A kedvenc gyümölcsöm a(z) banán"`.
     */

        String text = "A kedvenc gyümölcsöm a";
        String originalWord = "alma";
        String newWord = "banan";

        System.out.println(text);
        int day = 1;

     //   if (originalWord == newWord) {
     //   } else if (originalWord != newWord) {

            switch (day) {
                case 1:
                    System.out.println("banan");
                    break;
                case 2:
                    System.out.println("alma");


            }

        }
    }

}



