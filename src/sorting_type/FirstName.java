package sorting_type;

import person.Person;

import java.util.Comparator;

/**
 * Created by Taron on 03/31/17.
 */
public class FirstName implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.firstName.compareTo(o2.firstName);
    }
}
