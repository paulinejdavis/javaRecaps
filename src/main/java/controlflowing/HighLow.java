package controlflowing;

public class HighLow {

    public static void main(String[] args) {
        //declare an int array
        int[] grades = {2, 99, 44, 88, 54,66};
        int highest = grades[0];
        int lowest = grades[0];

        //for loop and if statements to determine the highest and lowest
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }

            if (grade < lowest) {
                lowest = grade;
            }

        }
            System.out.println("Highest grade: " + highest);
            System.out.println("Lowest grade: " + lowest);
        }

}
