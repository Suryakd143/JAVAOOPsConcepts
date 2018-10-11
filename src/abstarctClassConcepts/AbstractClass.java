package abstarctClassConcepts;

/**
 * Created by surya.dhal on 10/5/2018.
 */
abstract public class AbstractClass {
     /**
      * Abstract Class may or may not contain abstract Methods.
      * If All Method body are defined it is known as "Concrete Class".
      * Abstract Class never instantiated.(Object not created) because an object don't have abstract methods
      * and JVM cannot allocate memory of the abstract method.
      */

     //Abstract Method
     public abstract void abstractMethod();

     //Non-Abstract Method (Normal Method or Concrete Method)
     public void normalMethod(){
          System.out.println("This is Normal Method.");
     }
}


