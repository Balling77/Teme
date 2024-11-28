/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab9;


public class CremaFata extends Cosmetice {
    private boolean SPF;

    public CremaFata(String nume, String descriere, boolean SPF) {
        super(nume, descriere);
        this.SPF = SPF;
    }

    @Override
    public String toString() {
        return super.toString() + ", SPF: " + (SPF ? "Da" : "Nu");
    }
}

