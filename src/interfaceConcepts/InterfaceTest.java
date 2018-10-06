package interfaceConcepts;

/**
 * Created by surya.dhal on 10/5/2018.
 */
public class InterfaceTest implements InterfaceClass {
    @Override
    public void abstractMethod() {
        System.out.println("This is abstractMethod of InterfaceTest1 Class");
    }

    /**
     * If all methods of an Abstract class are implemented then it is called "Concrete Class"
     */
    public static void concreteMethod(){
        System.out.println("This is concrete method. of InterfaceTest1 Class");
    }
}

class InterfaceTest2 implements InterfaceClass{
    @Override
    public void abstractMethod() {
        System.out.println("This is abstractMethod of InterfaceTest2 Class");
    }
}


class mainClass{
    public static void main(String[] args) {
        System.out.println("This is main Method.");
        /**
         * If you create object in Reference of Interface Class then you can only access methods declared in InterfaceClass
         * You Can not access methods of Child Class by creating InterfaceClass reference.
         * You can use same object for different class through Interface Reference.
         */
        InterfaceClass it1 = new InterfaceTest();  //(Object creation with reference to Interface Class. (known as "Up-Casting"))
        it1.abstractMethod();

        InterfaceClass it2 = new InterfaceTest2();  //(Object creation with reference to Interface Class. (known as "Up-Casting"))
        it2.abstractMethod();

        InterfaceTest obj1 = new InterfaceTest();  //(Object creation with Child Class)
        obj1.concreteMethod();
    }
}
