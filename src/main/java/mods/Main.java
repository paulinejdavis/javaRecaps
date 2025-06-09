package mods;

import mods.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
        System.out.println("Address: " + person.address);
        //ssn not accessible because private
        //System.out.println("ssn: " + person.ssn);



        //AdvancedCalculator.performCalculations(2,2);

    }

}
