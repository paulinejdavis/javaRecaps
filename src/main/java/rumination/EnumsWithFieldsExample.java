package rumination;

public class EnumsWithFieldsExample {
    public static void main(String[] args) {
        for (Planet planet : Planet.values()) {
            System.out.println(planet);
            System.out.printf("%s is %.2f AU from the Sun%n", planet.getName(), planet.getDistanceFromSun());
        }
    }
}
