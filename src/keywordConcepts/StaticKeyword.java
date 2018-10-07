package keywordConcepts;

/**
 * Created by surya.dhal on 10/7/2018.
 */

/**
 * Static keyword mainly used for Memory Management.
 * You can use static keyword in --> variable
 *                               --> method
 *                               --> block
 * Static variable can be access directly by its class Name, no need to create object.
 * Static variables initialized once and before initialization of any instance variable.
 * If you have any common properties of all objects you can use static variable.
 * Non-Static variable cannot be used in Static Method directly.You can use by creating object of class.
 */

///////////////////////////// STATIC KEYWORD IN VARIABLE ///////////////////////////////
public class StaticKeyword {
    /**
     * Below company Name is common throughout the class so you can declare it static.
     */

    int ID;
    String eName;
    static final String companyName ="Mahindra Comviva ltd. pvt.";

    public StaticKeyword(int a, String name){
        this.ID = a;
        this.eName = name;
    }

    public void displayDetails(){
        System.out.println("EMP ID : "+ID+"\nEMP NAME : "+eName+"\nCOMPANY NAME : "+companyName);
    }

    public static void main(String[] args) {
      StaticKeyword obj1 = new StaticKeyword(1,"Surya");
      StaticKeyword obj2 = new StaticKeyword(2,"Navin");
      obj1.displayDetails();
      obj2.displayDetails();
    }

}

///////////////////////////// STATIC KEYWORD IN METHOD ////////////////////////////////

/**
 * You can directly call a method using  class Name (Static method belongs to the class not to object)
 * You can also call a static method using class object.
 * main method is defined as static because static method doesn't need object creation.
 * Otherwise JVM create object 1st then execute the main method
 */
class StaticKeywordMethod{
    public static void staticMethod(){
        System.out.println("This is static method.");
    }

    public static void main(String[] args) {
        /**
         * Here staticMethod is called directly by its Class Name.
         */
        StaticKeywordMethod.staticMethod();

        /**
         * Static Method call using Class object.
         */
        StaticKeywordMethod obj = new StaticKeywordMethod();
        obj.staticMethod();
    }
}

//////////////////////////////// STATIC KEYWORD IN BLOCK /////////////////////////////////

/**
 * "Static block" is used to only initialize "static data members" (objects) just like
 * "Constructor" used to initialize "instance data members" as well as Static variables.
 * Instance variables are not allows to initialize with in static block.
 */
class StaticKeywordBlock{
    public static String staticVariable;
    public String instanceVariable;

    static {
        staticVariable = "This is Static Variable";
        System.out.println(staticVariable);
    }
    public StaticKeywordBlock(){
        this.staticVariable = "This is new Static Variable.";
        this.instanceVariable ="This is Instance Variable";
    }

    //Non-Static Keyword can not be used in static method.
    /*public static void newMethod(){
        instanceVariable = "";
    }*/

    public static void main(String[] args) {
        StaticKeywordBlock obj = new StaticKeywordBlock();
        System.out.println(staticVariable);
        System.out.println(obj.instanceVariable);
    }
}


