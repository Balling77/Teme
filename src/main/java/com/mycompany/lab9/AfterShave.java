/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab9;

public class AfterShave extends Cosmetice {
    private boolean alcool;

    public AfterShave(String nume, String descriere, boolean alcool) {
        super(nume, descriere);
        this.alcool = alcool;
    }

    @Override
    public String toString() {
        return super.toString() + ", Alcool: " + (alcool ? "Da" : "Nu");
    }
}
