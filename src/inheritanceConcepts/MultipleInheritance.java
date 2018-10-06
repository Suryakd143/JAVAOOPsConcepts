package inheritanceConcepts;

/**
 * Created by surya.dhal on 10/6/2018.
 */

/**
 * When one child class extends more than one Parent class then it is called "Multiple Inheritance".
 * Multiple Inheritance is not supported in JAVA.
 * If both parent classes has same method then "Ambiguity" problem occur.
 * In below example both Parent Class contains same method "parentClassMethod"
 */

/**
 * PARENT CLASS 1
 */
public class MultipleInheritance {
    public void parentClassMethod(){
        System.out.println("This is Parent Class 1 Method.");
    }
}

/**
 * PARENT CLASS 2
 */
class MultipleInheritance1{
    public void parentClassMethod(){
        System.out.println("This is Parent Class 2 Method.");
    }
}

/**
 * Here Child Class extends multiple Parent Class.
 * Un-comment below Code for detail understanding.
 */

/*
class ChildClass extends ParentClass1, ParentClass2{
    public void childClassMethod(){
        System.out.println("This is Child Class Method.");
    }

    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.parentClassMethod();         //Ambiguous method call. (Mouse hover on the error to see the error message.)
    }
}*/
