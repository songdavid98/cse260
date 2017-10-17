import java.util.ArrayList;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    Sex gender;

    public Person(String n, Sex g) {
        name = n;
        gender = g;
    }

    public String getName() {
        return name;
    }

    public Sex getGender() {
        return gender;
    }

    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<Person>();
        Person a = new Person("Ana", Person.Sex.FEMALE);
        Person b = new Person("Bob", Person.Sex.MALE);
        Person c = new Person("Carl", Person.Sex.MALE);
        Person d = new Person("Dave", Person.Sex.MALE);
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);

        list
            .stream()
            .filter( e -> e.getGender() == Person.Sex.MALE )
            .forEach( e -> System.out.println(e.getName()) );

    } 
}