package com.Febrylian.PBO.Laprak2;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Username dan Password : ");
        String username = input.nextLine();
        String password = input.nextLine();

        if (username.equals("admin") && (password.equals("sandi"))){
            System.out.println("Login berhasil silahkan masuk!");
        } else if(username.equals("admin") && (!password.equals("sandi"))){
            System.out.println("Silahkan login dengan username dan password yang sah!");
        }
        else if (!username.equals("admin") && (password.equals("sandi"))){
            System.out.println("Silahkan login dengan username dan password yang sah!");
        } else {
            System.out.println("Username dan password yang Anda masukkan salah");
        }
    }
}
