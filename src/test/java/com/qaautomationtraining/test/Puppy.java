package com.qaautomationtraining.test;


/**
 * Created by Sadiq on 12/24/2018.
 */
public class Puppy {

    int puppyAge;

    public Puppy(String name) {
        // This constructor has one parameter, name.
        System.out.println("Name chosen is :" + name);
    }

    public static void main(String[] args) {
 /* Object creation */
        Puppy myPuppy = new Puppy("tommy");
 /* Call class method to set puppy's age */
        myPuppy.setAge(2);
 /* Call another class method to get puppy's age */
        myPuppy.getAge();
 /* You can access instance variable as follows as well */
        System.out.println("Puppy age :" + myPuppy.puppyAge);
        System.err.println("Puppy's age in human years :" + myPuppy.puppyAge * 7);
    }

    public int getAge() {
        System.out.println("Puppy's age is :" + puppyAge);
        return puppyAge;
    }

    public void setAge(int age) {
        puppyAge = age;
    }
}
