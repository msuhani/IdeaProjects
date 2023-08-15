package com.company;
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("enter a number : ");
        int num=reader.nextInt();
        if(num%2==0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }

    }
}