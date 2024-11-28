/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab9;

public class Sampon extends Cosmetice {
    private int cantitate;

    public Sampon(String nume, String descriere, int cantitate) {
        super(nume, descriere);
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cantitate: " + cantitate + " ml";
    }
}

