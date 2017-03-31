package person;

/**
 * Created by Taron on 03/31/17.
 */
public class Person {

    public String firstName;
    public String lastName;
    public int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.age = age;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("Name; %s, lastname: %s, age: %d",firstName,lastName,age);
    }
}
