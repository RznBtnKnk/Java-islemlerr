package com.example.demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int x=0;
        while(true){
            System.out.println("Sayiyi Giriniz :");
            String input = s.nextLine();

            if(input.equals("q")||input.equals("Q") ){
                break;
            }
            int i=Integer.parseInt(input);
            x+=topla(i);
        }
       System.out.println(x);
    }
    static int topla(int ...v){
        int temp=0;
        for(int x : v){
            temp+=x;
        }
       return temp;
    }
}
