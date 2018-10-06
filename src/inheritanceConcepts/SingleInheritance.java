package inheritanceConcepts;

/**
 * Created by surya.dhal on 10/6/2018.
 */

/**
 * Inheritance is a mechanism that allows a Class to Inherit(acquire) properties of another Class
 * Acquire only non-private members of parent class
 *
 * In Single Inheritance one Child Class only Inherit one Parent Class.
 * Here "SingleInheritance" is parent class and "InheritanceTest" is child class.
 * Here Child Class acquire method of parent Class.
 */
public class SingleInheritance {
    public void parentClassMethod() {
        System.out.println("This is Parent class Method");
    }
}

class A extends SingleInheritance {
    public void childClassMethod() {
        System.out.println("This is Child Class A Method");
    }
}

class SingleInheritanceTest {
    public static void main(String[] args) {
        A obj = new A();
        obj.parentClassMethod();
        obj.childClassMethod();
    }
}