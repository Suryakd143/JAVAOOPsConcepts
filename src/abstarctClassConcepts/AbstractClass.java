package abstarctClassConcepts;

/**
 * Created by surya.dhal on 10/5/2018.
 */
abstract public class AbstractClass {
     /**
      * Abstract Class may or may not contain abstract Methods.
      * If All Method body are defined it is known as "Concrete Class".
      * Abstract Class never instantiated.(Object not created) because an object don't have abstract methods
      * JVM does not know how much memory it has to allocate for that abstract method because abstract method does not have body implementation
      * and JVM cannot allocate memory of the abstract method.
      */

     //Abstract Method
     public abstract void abstractMethod();

     //Non-Abstract Method (Normal Method or Concrete Method)
     public void normalMethod(){
          System.out.println("This is Normal Method.");
     }
}


