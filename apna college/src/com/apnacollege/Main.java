package com.apnacollege;

import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void printJava(){
        System.out.println("Hello Java");
    }
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
//        // IntelliJ IDEA suggests fixing it.
//        System.out.println("Hello suhani!");
//        System.out.println();//sout and then tab
//        //variables
//        String name="suhani";
//        String hey=new String("paavni");
//
//        String neighbour="pankaj";
//        String friend=neighbour;
//        System.out.println(name.replace('s', 'b'));
//        System.out.println(name);
//        // strings are immutable
//        int age =30;
//        int physics=70;
//        int chem=90;
//        int eng=80;
//       // int[] marks=new int[3];
////        marks[0]=100;
////        marks[1]=90;
////        marks[2]=80;
////        System.out.println(marks[0]);
////        System.out.println(marks.length);
////        //sorting
////        System.out.println(marks[0]);
////        Arrays.sort(marks);
////        System.out.println(marks[0]);
//        final int P1=2;
//        //taking inputs
//        Scanner sc=new Scanner (System.in);
////        System.out.println("inpuut your age");
////       float ages=sc.nextFloat();
////        System.out.println(ages);
//        System.out.println("enter your name");
//        String names=sc.nextLine();
//        System.out.println(names);
//        //switch case
//        int day=1;
//        switch (day){
//            case 1 :
//                System.out.println("monday");
//                break;
//            case 2:
//                System.out.println("tuesday");
//                break;
//            default:
//                System.out.println("wed-sum");
//                break;
//        }
//        //try-catch in exception handling
//        int[] marks={97, 98, 99};
//        try{
//            System.out.println(marks[4]);
//        } catch(Exception exception){
//            //do smth after catching
//        }
//        System.out.println("suhani hello");
//        //methods
//        printJava();
//        printJava();
//        printJava();





        //System.out.println(name.length());


//        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Ctrl+D to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Cmd+F8.
//            System.out.println("i = " + i);

        //MINI PROJECT(guessing a number)
        int myNumber=(int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);
        int userNum=0;
        do {
            System.out.println("guess my number : ");
             userNum = sc.nextInt();
            if (userNum == myNumber) {
                System.out.println("correct");
                break;
            } else if (userNum > myNumber) {
                System.out.println("nope too large");

            } else {
                System.out.println("nope small");
            }
        }while(userNum>=0);
        System.out.println(" my number was : ");
        System.out.println(myNumber);
        }

    }
//}