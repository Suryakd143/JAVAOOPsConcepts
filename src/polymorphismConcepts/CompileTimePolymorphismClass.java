package polymorphismConcepts;

/**
 * Created by surya.dhal on 10/6/2018.
 */

/**
 * When you call an overloading method during compile time is known as Compile Time Polymorphism.
 * Method overloading occur in same class.
 * Method name should be same but parameter should be different in Method Overloading.
 * No need to create reference.
 * By changing return type method overloading is not possible.
 */

public class CompileTimePolymorphismClass {

    /**
     * Method overloading by changing Data type of parameter.
     * @param i
     */
    public static void method1(int i) {
        System.out.println("This is method-1 with 'int' parameter");
    }

    public static void method1(String d) {
        System.out.println("This is method-1 with 'String' parameter.");
    }

    /**
     * Method Overloading by Changing number of Arguments.
     * @param i
     */
    public static void method2(int i) {
        System.out.println("This is method-2 with one parameter of same type");
    }

    public static void method2(int i,int j) {
        System.out.println("This is method-2 with two parameter of same type.");
    }


    public static void main(String[] args) {
        CompileTimePolymorphismClass obj = new CompileTimePolymorphismClass();
        obj.method1(12);
        obj.method1("Surya");
        obj.method2(10);
        obj.method2(10,10);
    }

}
