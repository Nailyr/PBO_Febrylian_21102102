package com.Febrylian.PBO.pertemuan6;

public class TryCatch {
    public static void main(String[] args) {
        // Membuat Array
        int[] numbers = {1,2,3,4,5};

        /*System.out.println(numbers[6]);
        System.out.println("Proses selesai!");*/

        try {
            System.out.println(numbers[7]);
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array tidak segede itu!");
        }
        System.out.println("Proses selesai!");
    }
}
