package com.company;

public class varags {
//    static int sum(int a, int b) {
//        return a + b;
//    }
//    static int sum(int a, int b, int c) {
//        return a + b+c;
//    }
    //using varargs-taking multiple argumemts ;
    static int sum(int ...arr){
        int result=0;
        for(int a: arr){
            result+=a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("welcome ");

        System.out.println("the sum of 4 and 5 is : " +sum(4, 3, 5));
       // System.out.println("sum "+sum(2,3,4,5,6,7,));
        System.out.println("sum : " +sum(2,3,4,5,6,7,8,9,10));
    }
}
