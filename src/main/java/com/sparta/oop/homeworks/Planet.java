package com.sparta.oop.homeworks;

public enum Planet {
    MERCURY("Mercury", "3.30104 × 10^23", 57909227L, 3.7, 0, 88),
    VENUS("Venus", "4.86732 × 10^24", 108209475L, 8.87, 0, 225),
    EARTH("Earth", "5.97219 × 10^24", 149598262L, 9.81, 1, 365),
    MARS("Mars", "6.41693 × 10^23", 227943824L, 3.71, 2, 687),
    JUPITER("Jupiter", "1.89813 × 10^27", 778340821L, 24.79, 79, 4333),
    SATURN("Saturn", "5.68319 × 10^26", 1426666422L, 10.4, 83, 10759),
    URANUS("Uranus", "8.68103 × 10^25", 1426666422L, 8.87, 27, 30687),
    NEPTUNE("Neptune", "1.0241 × 10^26", 4498396441L, 11.15, 14, 60190),
    pluto("pluto", "1.309 × 10^22", 5906440628L, 0.66, 5, 90530);

    private final String planetName;
    private final String mass; // kg
    private final long avgOrbitDist; // km
    private final double surfaceGravity; // m/s^2
    private final int noOfMoons;
    private final int lengthOfYear; // Earth days

    Planet(final String planetName, final String mass, final long avgOrbitDist, final double surfaceGravity, final int noOfMoons, final int lengthOfYear) {
        this.planetName = planetName;
        this.mass = mass;
        this.avgOrbitDist = avgOrbitDist;
        this.surfaceGravity = surfaceGravity;
        this.noOfMoons = noOfMoons;
        this.lengthOfYear = lengthOfYear;
    }

    public String getName() { return planetName; }

    public String getMass() { return mass; }

    public long getAvgOrbitDist() { return avgOrbitDist; }

    public double getSurfaceGravity() { return surfaceGravity; }

    public int getNoOfMoons() { return noOfMoons; }

    public int getLengthOfYear() { return lengthOfYear; }

}
