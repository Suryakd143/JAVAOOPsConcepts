package keywordConcepts;

/**
 * Created by surya.dhal on 10/7/2018.
 */
public class FinalKeyword {
    /**
     * You can declare Final to --> (1) Variable (Data Members)
     *                              (2) Method
     *                              (3) Class
     * If you assign a variable as final then the value of the variable cannot be changed.
     * If you use final variable inside class and not assigning value then you must have to assign value in class constructor.
     * Below "finalString" is a variable which is declare as final and no value is assigned to it.
     * So the value is assigned in constructor "FinalKeywordClass".
     */

    public final String finalString;

    public FinalKeyword() {
        this.finalString = "This is Final String.";
        System.out.println(this.finalString);
    }

   /* public void changeFinalValue(){
        this.finalString = "Sanjay";                //Unblock the code and mouse hover to the error to see the error-message
    }*/

}

///////////////////////////// FINAL METHOD CONCEPT /////////////////////////////

/**
 * You can not override final method by Subclasses.
 * Here final method is overridden which is not allowed.
 * "Method Overloading" of final method is possible not "Method Overriding"
 * Unblock below commented method to see the error.
 */
class FinalMethodClass {
    public final void finalMethod() {
        System.out.println("This is a final Method of 'FinalKeywordClass' class.");
    }
}
class FinalMethodClassTest extends FinalMethodClass {
  /*  public final void finalMethod(){
        System.out.println("This is a final Method of 'FinalKeywordClassTest' class.");
    }*/

    public static void main(String[] args) {
        FinalMethodClassTest obj = new FinalMethodClassTest();
        obj.finalMethod();
    }
}

////////////////////////// FINAL CLASS CONCEPT //////////////////////////////////

/**
 * Here "finalClass" is declared as final.
 * Final class cannot be inherit by Child Class.
 * All method of a final class are by default "final".
 * Data members are not necessary to be final.
 */
final class finalClass {
    public String finalString;
    public void method1(){
        System.out.println("This is method1 of finalClass");
    }
}

/*class finalClassTest extends finalClass {

}*/
