/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab9;

import com.mycompany.lab9.Email;
import com.mycompany.lab9.AdresaEmail;

public class Lab10 {
    public static void main(String[] args) {
        // Creare adrese de email
        AdresaEmail expeditor = new AdresaEmail("expeditor@example.com");
        AdresaEmail destinatar = new AdresaEmail("destinatar@example.com");

        // Creare email
        Email email = new Email(
            expeditor,
            destinatar,
            "Salutare!",
            "Acesta este un mesaj de test. Sper că totul este bine!"
        );

        // Simulare trimitere email
        trimiteEmail(email);

        // Simulare primire email
        primesteEmail(email);
    }

    public static void trimiteEmail(Email email) {
        System.out.println("Trimiterea email-ului...");
        System.out.println(email);
        System.out.println("Email trimis cu succes!\n");
    }

    public static void primesteEmail(Email email) {
        System.out.println("Primirea email-ului...");
        System.out.println(email);
        System.out.println("Email primit cu succes!");
    }
}

