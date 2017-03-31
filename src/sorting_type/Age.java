package sorting_type;

import person.Person;

import java.util.Comparator;

/**
 * Created by Taron on 03/31/17.
 */
public class Age implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.age - o2.age;
    }
}
