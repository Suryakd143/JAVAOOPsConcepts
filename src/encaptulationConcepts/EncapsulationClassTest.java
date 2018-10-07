package encaptulationConcepts;

/**
 * Created by surya.dhal on 10/6/2018.
 */
public class EncapsulationClassTest {
    public static void main(String[] args) {
        EncapsulationClass obj = new EncapsulationClass();
        obj.setAge("23");
        obj.setCity("Gurgaon");
        obj.setCompany("Mahindra Comviva");
        obj.setName("Surya kanta Dhal");

        System.out.println("Name : "+obj.getName()+"\nAge : "+obj.getAge()+"\nCity : "+obj.getCity()+"\nCompany : "+obj.getCompany());
    }
}
