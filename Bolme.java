package com.example.demo;

import java.util.Scanner;

public class Bolme {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int x=0;
        int y=0;
        while(true){
            System.out.println("Islemi Sec:" +"\n"+
                    "Toplama Icin => T" +"\n"+
                    "Bolme Icin => B"+"\n");
            String i = s.nextLine();
            if(i.equals("T")){
                while(true) {
                    System.out.println("Sayiyi Giriniz :");
                    String input = s.nextLine();
                    if (input.equals("q") || input.equals("Q")) {
                        break;
                    }
                    int in = Integer.parseInt(input);
                    x += topla(in);

                }
                System.out.println("Sonuc= "+x);
            }
            else if(i.equals("B")){
                while(true) {
                    System.out.println("Sayiyi Giriniz :");
                    String input = s.nextLine();

                    if (input.equals("q") || input.equals("Q")) {
                        break;
                    }
                    int in = Integer.parseInt(input);
                    if(y == 0){
                        y=bol(in);
                    }
                    else
                        y=y/bol(in);
                }
                System.out.println("Sonuc= "+y);
            }
            else
                System.out.println("Gecerli Islemi Giriniz :");

        }

    }
    static int topla(int ...v){
        int temp=0;
        for(int x : v){
            temp+=x;
        }
        return temp;
    }
    static int bol(int ...v){
        int temp=0;
            for(int x : v){
                if(temp == 0){
                    temp =x;
                }
                else
                    temp=temp/x;
            }

            return temp;


    }
}
