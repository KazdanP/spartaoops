package com.sparta.oop.homeworks;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class planetenumstest {

    @Test
    void earthTest() {
        String expectedName = "Earth";
        String actualName = Planet.EARTH.getName();

        assertThat(actualName).isEqualTo(expectedName);

        String expectedMass = "5.97219 × 10^24";
        String actualMass = Planet.EARTH.getMass();

        assertThat(actualMass).isEqualTo(expectedMass);

        long expectedAOD = 149598262;
        long actualAOD = Planet.EARTH.getAvgOrbitDist();

        assertThat(actualAOD).isEqualTo(expectedAOD);
    }

    @Test
    void marsTest() {
        String expectedName = "Mars";
        String actualName = Planet.MARS.getName();

        assertThat(actualName).isEqualTo(expectedName);

        double expectedGravity = 3.71;
        double actualGravity = Planet.MARS.getSurfaceGravity();

        assertThat(actualGravity).isEqualTo(expectedGravity);

        int expectedYear = 687;
        int actualYear = Planet.MARS.getLengthOfYear();

        assertThat(actualYear).isEqualTo(expectedYear);
    }

    @Test
    void neptuneTest() {
        String expectedName = "Neptune";
        String actualName = Planet.NEPTUNE.getName();

        assertThat(actualName).isEqualTo(expectedName);

        int expectedNOM = 14;
        int actualNOM = Planet.NEPTUNE.getNoOfMoons();

        assertThat(actualNOM).isEqualTo(expectedNOM);

        long expectedYear = 60190;
        long actualYear = Planet.NEPTUNE.getLengthOfYear();

        assertThat(actualYear).isEqualTo(expectedYear);
    }

}
