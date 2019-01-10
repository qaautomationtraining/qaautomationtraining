package com.qaautomationtraining.test;

/* CallingMethodsInSameClass.java
 *
 * illustrates how to call static methods a class
 * from a method in the same class
 */

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Date;

public class CallingMethodsInSameClass
{
    public static void main(String[] args) {
        printOne();
        System.out.println("printing method one which has 1 printone metiod");
        printOne();
        System.out.println("printing method one which has 1 printone metiod");
        printTwo();
        System.out.println("printing method two which has 2 printone metiod");
    }

    public static void printOne() {
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println("Hello World");
    }

    public static void printTwo() {
        printOne();
        printOne();
        System.out.println("printing method two which has 2 printone metiod");
    }
}