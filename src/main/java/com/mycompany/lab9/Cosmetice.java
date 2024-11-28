/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab9;

public class Cosmetice {
    protected String nume;
    protected String descriere;

    public Cosmetice(String nume, String descriere) {
        this.nume = nume;
        this.descriere = descriere;
    }

    @Override
    public String toString() {
        return "Nume: " + nume + ", Descriere: " + descriere;
    }
}

