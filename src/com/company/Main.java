package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println("Addition of two numbers:");
        System.out.println("Answer is = " + cal.add(2,2));
        System.out.println("Subtraction of two numbers:");
        System.out.println("Answer is = " +cal.sub(4,2));
        System.out.println("Multiplication of two numbers:");
        System.out.println("Answer is = " +cal.mul(5,5));
        System.out.println("Division of two numbers:");
        System.out.println("Answer is = " +cal.div(10,5));

        System.out.println("Addition of two numbers:");
        System.out.println("Answer is = " + cal.add(2.5,2.3));
        System.out.println("Subtraction of two numbers:");
        System.out.println("Answer is = " +cal.sub(4.5,2.8));
        System.out.println("Multiplication of two numbers:");
        System.out.println("Answer is = " +cal.mul(5.2,5.9));
        System.out.println("Division of two numbers:");
        System.out.println("Answer is = " +cal.div(10.15,5.15));

    }
}
