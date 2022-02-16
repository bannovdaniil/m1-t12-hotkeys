package ru.yandex.practicum.petrol;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PetrolCalculatorTest {
    @Test
    void ai92calculator() {
        double price = new Ai92Calculator().calculate(10.0);
        Assertions.assertEquals(482.96, price, 0.01);
    }
}