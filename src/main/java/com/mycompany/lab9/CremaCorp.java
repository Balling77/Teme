/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab9;

public class CremaCorp extends Cosmetice {
    private int gramaj;

    public CremaCorp(String nume, String descriere, int gramaj) {
        super(nume, descriere);
        this.gramaj = gramaj;
    }

    @Override
    public String toString() {
        return super.toString() + ", Gramaj: " + gramaj + " g";
    }
}

