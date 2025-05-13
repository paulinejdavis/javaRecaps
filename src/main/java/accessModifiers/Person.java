package accessModifiers;

public class Person {

    protected String name;
    private String secret;

    protected void sayHi() {
        System.out.println("Hello, I'm " + name) ;
    }

    private void tellSecret() {
        System.out.println("The secret is " + secret) ;
    }
}
