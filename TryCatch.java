
package com.company;

import java.util.Scanner;
public class TryCatch {
    public static void main(String[] args) {
        int [] dizi = {1,2,3,4,5,6,7,8,9,10};

        Scanner input = new Scanner(System.in);
        System.out.println("İndeks giriniz: ");
        int indeks = input.nextInt();

        try{
            int eleman = getElemanByIndex(dizi, indeks);
            System.out.println("Seçilen eleman : " + eleman);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Hata : Dizi boyutunun dışında bir indeks girdiniz!");
        }
    }
    public static int getElemanByIndex(int[] dizi, int indeks){
        if(indeks < 0 || indeks >= dizi.length){
            throw new ArrayIndexOutOfBoundsException();
        }
        return dizi[indeks];
    }
}
}
