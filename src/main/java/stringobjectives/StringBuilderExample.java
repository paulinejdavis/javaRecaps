package stringobjectives;

public class StringBuilderExample {
    public static void main (String[] args) {
        StringBuilder blah = new StringBuilder("Ouch");
        StringBuilder blow = new StringBuilder("Goddamn");


        System.out.println("Using equals: " + blah.toString().equals(blow.toString()));
        blow.append(blah);
        System.out.println(blah);

        blow.reverse();
        System.out.println(blow);

//        System.out.println(blah.equals(blow));
//        System.out.println(blah.append(blow));
//        System.out.println(blah.reverse());
    }
}
