package primitivevsobject;

public class Person2 {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Elvis";
        person.age = 21;
        System.out.println("Name: " + person.name);
        System.out.println("age: " + person.age);
    }

    static class Person {
        public String name;
        public int age;

    }

}

