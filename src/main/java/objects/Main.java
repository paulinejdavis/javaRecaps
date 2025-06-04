package objects;


class Person {
    String name;
    int age;
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Click Clarke";
        person.age = 99;

        System.out.println("before: " + person.name + ", " + person.age);
        modifyPerson(person);
        System.out.println("after: " + person.name + ", " + person.age);
    }

    public static void modifyPerson(Person p) {
        p.name = "Still Clarke";
        p.age = 21;
    }

}






