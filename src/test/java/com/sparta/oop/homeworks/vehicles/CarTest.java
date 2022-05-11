package com.sparta.oop.homeworks.vehicles;

import com.sparta.oop.homeworks.vehicles.enums.CarClassification;
import com.sparta.oop.homeworks.vehicles.enums.EngineType;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    @Test
    void gemeraTest() {
        Car gemera = new Car("Koenigsegg", "Gemera", "Grey", EngineType.HYBRID, 2.0, CarClassification.GRAND_TOURER);

        String expectedColor = "Grey";
        String actualColor = gemera.getColor();

        assertThat(actualColor).isEqualTo(expectedColor);

       String expectedMake = "Koenigsegg";
       String actualMake = gemera.getMake();

       assertThat(actualMake).isEqualTo(expectedMake);

       double expectedEngineSize = 2.0;
       double actualEngineSize = gemera.getEngineSize();

       assertThat(actualEngineSize).isEqualTo(expectedEngineSize);
    }
}
