/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab9;

import com.mycompany.lab9.AdresaEmail;

public class Email {
    private AdresaEmail expeditor;
    private AdresaEmail destinatar;
    private String subiect;
    private String continut;

    public Email(AdresaEmail expeditor, AdresaEmail destinatar, String subiect, String continut) {
        if (subiect == null || subiect.isEmpty()) {
            throw new IllegalArgumentException("Subiectul nu poate fi gol!");
        }
        if (continut == null || continut.isEmpty()) {
            throw new IllegalArgumentException("Conținutul nu poate fi gol!");
        }
        this.expeditor = expeditor;
        this.destinatar = destinatar;
        this.subiect = subiect;
        this.continut = continut;
    }

    public AdresaEmail getExpeditor() {
        return expeditor;
    }

    public AdresaEmail getDestinatar() {
        return destinatar;
    }

    public String getSubiect() {
        return subiect;
    }

    public String getContinut() {
        return continut;
    }

    @Override
    public String toString() {
        return "De la: " + expeditor + "\nCătre: " + destinatar + "\nSubiect: " + subiect + "\nConținut: " + continut;
    }
}

