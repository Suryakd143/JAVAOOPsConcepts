package inheritanceConcepts;

/**
 * Created by surya.dhal on 10/6/2018.
 */

/**
 * If more than one child class inherit a single parent class then it is called "Hierarchical" Inheritance
 * Here both D and E extends same parent class "HierarchicalInheritance".
 */
public class HierarchicalInheritance {

    public void parentClassMethod(){
        System.out.println("This is Parent Class Method");
    }
}

class D extends HierarchicalInheritance{
    public void classDChildMethod(){
        System.out.println("This is class D Child Method");
    }
}

class E extends HierarchicalInheritance{
    public void classEChildMethod(){
        System.out.println("This is class E Child Method");
    }
}

class HierarchicalInheritanceTest{
    public static void main(String[] args) {
        /**
         * Here you can only access properties of Parent class and own properties.
         */
        D obj = new D();
        obj.parentClassMethod();
        obj.classDChildMethod();

        E obj1 = new E();
        obj1.parentClassMethod();
        obj1.classEChildMethod();
    }
}
