import person.Employee;
import person.Person;
import sorting_type.Age;
import sorting_type.FirstName;
import sorting_type.LastName;
import sorting_type.Salary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by Taron on 03/31/17.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number. 1 or 2 or 3 or 4.");
        int numberId = scanner.nextInt();
        ArrayList<Person> arrayList = new ArrayList<>();
        boolean answer = true;
        arrayList.add(new Person("Tigran", "Gevorgyan", 22));
        arrayList.add(new Person("Aurgen", "Sargsyan", 61));
        arrayList.add(new Person("Toros", "Rosilis", 16));
        arrayList.add(new Person("Mnacakan", "Abajyan", 20));
        arrayList.add(new Person("Hakob", "Minoyan", 5));
        arrayList.add(new Employee("Anna", "Galstyan", 36, 200000));
        arrayList.add(new Employee("Anna", "Galstyan", 36, 200100));
        arrayList.add(new Employee("Lilit", "Grigoryan", 56, 120000));
        arrayList.add(new Employee("Narine", "Poxosyan", 25, 80000));
        arrayList.add(new Employee("Gvenik", "Petrosyan", 55, 250000));
        arrayList.add(new Employee("Nina", "Mkrtchyan", 29, 100000));

        switch (numberId){
            case 1:
                System.out.println("Sorting by first name.");
                Collections.sort(arrayList,new FirstName());
                break;
            case 2:
                System.out.println("Sorting by last name.");
                Collections.sort(arrayList,new LastName());
                break;
            case 3:
                System.out.println("Sorting by age.");
                Collections.sort(arrayList,new Age());
                break;
            case 4:
                System.out.println("Sorting by salaries.");
                Collections.sort(arrayList,new Salary());
                break;
            default:
                answer = false;
                System.out.println("Fault number.");
        }
        if(answer) {
            for (Person p : arrayList)
                System.out.println(p);
        }

    }
}
