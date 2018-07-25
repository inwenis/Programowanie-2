package Debugowanie;

import java.util.ArrayList;
import java.util.Iterator;

public class RemovePeople {

    public static void main(String[] args) {
        Person ben = new Person("Ben");

        ArrayList<Person> persons = new ArrayList<>();

        persons.add(new Person(new String("Ben")));
        persons.add(new Person(new String("Alyssa")));
        persons.add(new Person(new String("Alice")));

        ArrayList<Person> persons2 = new ArrayList<>();

        for (Person person : persons) {
            if (person.hasSameName(ben)) {
                persons2.add(person);
            }
        }
        persons.removeAll(persons2);
        System.out.println(persons);


        Student s1 = new Student("Klara", "C-", "2");

        s1.inflateGrade();
        s1.boostAttendance();
        System.out.println(s1);



    }
}