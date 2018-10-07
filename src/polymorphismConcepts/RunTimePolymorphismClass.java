package polymorphismConcepts;

/**
 * Created by surya.dhal on 10/6/2018.
 */

import javafx.scene.Parent;

/**
 * When a "Single Action" done in "different way" then Polymorphism concept comes under in JAVA.
 * Two type of Polymorphism :
 * (1) Run-Time Polymorphism (Dynamic Polymorphism)
 * (2) Compile-Time Polymorphism
 * <p>
 * (1) Run-Time Polymorphism : -->When overridden method decided at runtime that (which method will be run) is known as "Run-Time Polymorphism"
 * Run time Polymorphism can be implemented using "Method Overriding".
 * <p>
 * -->In below example "action" method is implemented in both Parent and Child class.
 * <p>
 * --> When Child class and Parent class having the same method Name it is known as "Method Overriding".
 * <p>
 * --> Object creation done using reference of Parent Class to Child class.
 */


public class RunTimePolymorphismClass {

    void action() {
        System.out.println("This is method of Parent Class 'RunTimePolymorphismClass'.");
    }
}

class MethodOverridingClass extends RunTimePolymorphismClass {

    void action() {
        System.out.println("This is method of Child Class 'MethodOverridingClass'.");
    }
}

class MethodOverridingTest{
    public static void main(String[] args) {
        /**
         * Here Object is created using reference of Parent Class to Child class known as Up-Casting.
         * Below I decided to run overridden method of Child class by creating Reference of Parent Class to Child Class
         */
        RunTimePolymorphismClass obj = new MethodOverridingClass(); //UpCasting (Down-Casting is not allowed)
        obj.action();

        /**
         * Below parent class method will be run
         */
        RunTimePolymorphismClass obj1 = new RunTimePolymorphismClass();
        obj1.action();

    }
}


