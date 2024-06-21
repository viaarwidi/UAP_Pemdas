/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uap1a;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class UAP1A {


    public static String validateUsername(String username) {
     
        if (username.length() < 5) {
            return "Panjang username kurang dari 5 karakter.";
        }

        if (username.contains(" ")) {
            return "Username tidak boleh mengandung spasi.";
        }

        return "Username valid.";
    }

    public static String validatePassword(String password) {
       
        if (password.length() < 8) {
            return "Panjang password kurang dari 8 karakter.";
        }

        if (!Character.isUpperCase(password.charAt(0))) {
            return "Password harus diawali dengan huruf kapital.";
        }

        return "Password valid.";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();

        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        String resultUsername = validateUsername(username);

        String resultPassword = validatePassword(password);

        System.out.println(resultUsername);
        System.out.println(resultPassword);
        
        System.out.println("");
    }
}


