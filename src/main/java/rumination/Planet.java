package rumination;

enum Planet {
    MARS("Mars", 0.39),
    PLUTO("Pluto", 0.72);

    private final String name;
    private final double distanceFromSun;

    public String getName() {
        return name;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    Planet(String name, double distanceFromSun) {
        this.name = name;
        this.distanceFromSun = distanceFromSun;



    }
}
