package com.Febrylian.PBO.Laprak6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BagiBilangan {
    public static int BagiBilangan(int Bil1, int Bil2){
        return Bil1 / Bil2;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try{
            System.out.print("Masukkan bilangan : ");
            int bil1 = input.nextInt();

            System.out.print("Masukkan pembagi : ");
            int bil2 = input.nextInt();

            int hasil = BagiBilangan(bil1, bil2);
            System.out.println(bil1 + " / " + bil2 + " = " + hasil);
        }
        catch(ArithmeticException e){
            System.out.println("Error : Pembagian dengan nol tidak diperbolehkan!");
        }
        catch(InputMismatchException e){
            System.out.println("Error : Input tidak valid. Harap masukkan bilangan bulat!");
        }
    }
}
