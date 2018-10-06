package abstarctClassConcepts;

/**
 * Created by surya.dhal on 10/5/2018.
 */
public class ChildClass extends AbstractClass {

    public void childClassMethod(){
        System.out.println("This is Child Class Method");
    }


    /**
     * Abstract Method "abstractMethod" implemented Here which is declared in Abstract Class.
     * Here "abstractMethod" is implemented.
     */
    @Override
    public void abstractMethod() {
        System.out.println("This is Abstract Method.");
    }

    /**
     * Abstract Method can be used by creating Reference of Abstract class with Child Class (Up-Casting).
     * Abstract Method can also be used by creating Child Class object.
     * @param args
     */
    public static void main(String[] args) {
        /**
         * object Using Abstract Class reference
         * You can not access child class method using Abstract Class reference.
         */
        AbstractClass obj = new ChildClass();  //This process is known as "Up-Casting"
        obj.abstractMethod();
        /**
         * Object creation using Child Class
         */
        ChildClass obj2 = new ChildClass();
        obj2.normalMethod();
        obj2.childClassMethod();
    }
}



