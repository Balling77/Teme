/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab9;

public class Lab9 {
    public static void main(String[] args) {
        // Instanțe pentru fiecare clasă
        Sampon sampon1 = new Sampon("Head & Shoulders", "Anti-mătreață", 500);
        Sampon sampon2 = new Sampon("Nivea", "Hidratare", 400);
        Sampon sampon3 = new Sampon("L'Oreal", "Reparare", 300);

        CremaFata cremaFata1 = new CremaFata("Nivea Soft", "Hidratare", true);
        CremaFata cremaFata2 = new CremaFata("Garnier", "Anti-rid", false);
        CremaFata cremaFata3 = new CremaFata("Vichy", "Nutriție intensă", true);

        CremaCorp cremaCorp1 = new CremaCorp("Dove", "Hidratare", 250);
        CremaCorp cremaCorp2 = new CremaCorp("Palmers", "Anti-vergeturi", 300);
        CremaCorp cremaCorp3 = new CremaCorp("Neutrogena", "Reparare", 200);

        AfterShave afterShave1 = new AfterShave("Nivea Men", "Răcoritor", true);
        AfterShave afterShave2 = new AfterShave("Gillette", "Calmare", false);
        AfterShave afterShave3 = new AfterShave("Axe", "Energizant", true);

        GelDeDus gelDeDus1 = new GelDeDus("Fa", "Citrus Fresh", 500);
        GelDeDus gelDeDus2 = new GelDeDus("Dove", "Gentle Touch", 400);
        GelDeDus gelDeDus3 = new GelDeDus("Old Spice", "Cool Wave", 600);

        // Afișare
        System.out.println(sampon1);
        System.out.println(sampon2);
        System.out.println(sampon3);

        System.out.println(cremaFata1);
        System.out.println(cremaFata2);
        System.out.println(cremaFata3);

        System.out.println(cremaCorp1);
        System.out.println(cremaCorp2);
        System.out.println(cremaCorp3);

        System.out.println(afterShave1);
        System.out.println(afterShave2);
        System.out.println(afterShave3);

        System.out.println(gelDeDus1);
        System.out.println(gelDeDus2);
        System.out.println(gelDeDus3);
    }
}

