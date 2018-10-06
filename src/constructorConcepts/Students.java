package constructorConcepts;

/**
 * Created by surya.dhal on 10/4/2018.
 */
public class Students {

    private static String myName = null;

    /**
     * Constructor doesn't have a return type.
     * Constructor is a instance method usually has the same name of class.
     * Here method "Students" is a Constructor as the name is same as Class Name.
     * @param name
     */
    public Students(String name) {
        myName = name;
    }

    public void display(){
        System.out.println("Hello ! "+myName);
    }

}
