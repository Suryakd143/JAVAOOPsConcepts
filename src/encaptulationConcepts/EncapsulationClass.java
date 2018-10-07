package encaptulationConcepts;

/**
 * Created by surya.dhal on 10/6/2018.
 */

/**
 * It is a process of wrapping code and data together into a single unit.
 * Data-hiding concepts are implemented here by declaring all variables private.
 * Write public methods in that class to set and get the values of that private variables (Using setter and getter method).
 */
public class EncapsulationClass {
    private String Name;
    private String Age;
    private String City;
    private String Company;

    /**
     * Below Getter and Setter are used for all the above variables.
     * @return
     */


    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
