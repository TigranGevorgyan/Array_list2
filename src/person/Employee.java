package person;

/**
 * Created by Taron on 03/31/17.
 */
public class Employee extends Person {

    public int salary;

    public Employee(String firstName, String lastName, int age, int salary) {
        super(firstName, lastName, age);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", salary: %d.",salary);
    }
}
