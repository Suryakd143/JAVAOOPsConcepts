package inheritanceConcepts;

/**
 * Created by surya.dhal on 10/6/2018.
 */

/**
 * When One Child Class is the Parent of another Child Class it is called "MultiLevelInheritance".
 * Here "MultiLevelInheritance" is the Parent of class "B" and class "B" is the parent of class "C".
 *
 */
public class MultiLevelInheritance {
    public void parentClassMethod(){
        System.out.println("This is Parent class Method");
    }
}

class B extends MultiLevelInheritance{
    public void classBMethod(){
        System.out.println("This is class B Method");
    }
}

class C extends B{
    public void classCMethod(){
        System.out.println("This is class C Method");
    }
}

class MultiLevelInheritanceTest{
    public static void main(String[] args) {
        C obj = new C();
        obj.parentClassMethod();
        obj.classBMethod();
        obj.classCMethod();
    }
}
