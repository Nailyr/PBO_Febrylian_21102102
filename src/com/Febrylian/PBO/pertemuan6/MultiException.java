package com.Febrylian.PBO.pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;
public class MultiException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Masukkan bilangan : ");
            int bil1 = input.nextInt();

            System.out.println("Masukkan pembagi : ");
            int bil2 = input.nextInt();

            int hasil = bil1/bil2;
            System.out.println(bil1 + " / " + bil2 + " = " + hasil + "(dibulatkan");
        }
//
//        catch(ArithmeticException | InputMismatchException e){
//            System.out.println("Error: Program tidak dapat diproses :(");
//        }

        // Multiple Catch
        catch(ArithmeticException e){
            System.out.println("Error : Program tidak dapat diproses :(");
        }
        catch(InputMismatchException e){
            System.out.println("Error : Program hanya dapat memproses angka saja! :(");
        }
        System.out.println("Proses selesai! :)");
    }
}