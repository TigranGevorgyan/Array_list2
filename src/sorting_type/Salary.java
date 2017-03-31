package sorting_type;

import person.Employee;
import person.Person;

import java.util.Comparator;

/**
 * Created by Taron on 03/31/17.
 */
public class Salary implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if(!(o1 instanceof Employee && o2 instanceof Employee)){
            return 0;
        }
        else return ((Employee) o2).salary - ((Employee) o1).salary;
    }
}
