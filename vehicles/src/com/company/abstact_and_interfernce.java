package com.company;

abstract class base{
    public base(){
        System.out.println("i am a constructor for base 2");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}
class derived extends base{
    @Override
    public void greet() {
        System.out.println("morning");
    }
}
public class abstact_and_interfernce {
    public static void main(String[] args) {
        //abstract method-declared without an implementation
        //abstract class-a class that has abstract methods
        //no objects of abstract class can be made
        //inherited classes can be made
        //
    }
}
