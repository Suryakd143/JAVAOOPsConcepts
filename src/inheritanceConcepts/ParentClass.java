package inheritanceConcepts;

/**
 * Created by surya.dhal on 10/6/2018.
 */

/**
 * PARENT CLASS
 */
public class ParentClass {
    /**
     * Inheritance is a mechanism that allows a Class to Inherit(acquire) properties of another Class
     * Acquire only non-private members of parent class
     */

    private String accountNumber;
    private int atmPIN;
    public String pName;
    public String pAge;
}

/**
 * CHILD CLASS
 */

class ChildClass1 extends ParentClass {
    /**
     * You can access only non-private properties of parent class.
     * Access parent properties by "extends" keyword.
     * Create object of child class and access properties of ParentClass.
     * You can not access a non-static properties in a static method
     * "super" keyword used to define immediate parent class of a subclass
     * 3-types of Inheritance :
     *                          (1) Single Inheritance
     *                          (2) Multiple Inheritance  (Not supported by JAVA)
     *                          (3) Multilevel Inheritance
     *                          (4) Hierarchical Inheritance
     *                          (5) Hybrid Inheritance
     *
     */

    private String childName;

    public static void main(String[] args) {
        ChildClass1 obj = new ChildClass1();
        obj.showDetailsOf1stChild();
        obj.showDetailsOf2ndChild();
    }

    public void showDetailsOf1stChild() {
        this.childName = "Surya";
        super.pName = "Prasan Dhal";
        super.pAge = "45";
        System.out.println("Child Name : "+childName);
        System.out.println("Parents Name : "+pName);
        System.out.println("Parents Age : "+pAge);
    }

    public void showDetailsOf2ndChild() {
        this.childName = "Lipi";
        super.pName = "Prasan Kumar Dhal";
        super.pAge = "45";
        System.out.println("Child Name : "+childName);
        System.out.println("Parents Name : "+pName);
        System.out.println("Parents Age : "+pAge);
    }
}

