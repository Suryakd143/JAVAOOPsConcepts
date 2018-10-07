package constructorConcepts;

/**
 * Created by surya.dhal on 10/4/2018.
 */
public class ConstructorClass {

    private static String myName = null;

    /**
     * Constructor doesn't have a return type.
     * Constructor is a instance method usually has the same name of class.
     * Here method "ConstructorClass" is a Constructor as the name is same as Class Name.
     *
     * @param name
     */
    public ConstructorClass(String name) {
        myName = name;
    }

    public void display(){
        System.out.println("Hello ! "+myName);
    }

}


class ConstructorClassTest{

    public static void main(String[] args) {

        /**
         * Variables are initialized when object is created.
         * Data passed during time of object creation.
         * All Code within executed during time of object creation.
         */
        ConstructorClass con = new ConstructorClass("Surya Kanta Dhal");
        con.display();
    }

}
