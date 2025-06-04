package controlflowing;

public class SwitchingStudents {


    public static void main(String[] args) {

        char grade = 'C';
        String comments;

        switch (grade) {
            case 'A':
                comments = "High grade";
                break;
            case 'B':
                comments = "good grade";
                break;
            case 'C':
                comments = "this is a pass";
                break;
            case 'D':
                comments = "this is below average";
                break;
            case 'F':
                comments = "this is a fail";
                break;
            default:
                comments = "invalid input";
        }
        System.out.println("Your mark is: " + comments);

    }
}
