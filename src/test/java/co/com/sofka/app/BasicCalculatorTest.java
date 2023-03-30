package co.com.sofka.app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorTest {

    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing sum: 1+1=2")
    public void sum() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.sum(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing sub: 10-5=5")
    public void sub() {
        // Arrange
        Long number1 = 10L;
        Long number2 = 5L;
        Long expectedValue = 5L;

        // Act
        Long result = basicCalculator.sub(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing mul: 10*5=50")
    public void mul() {
        // Arrange
        Long number1 = 10L;
        Long number2 = 5L;
        Long expectedValue = 50L;

        // Act
        Long result = basicCalculator.mul(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing div: 100/5=20")
    public void div() {
        // Arrange
        Long number1 = 100L;
        Long number2 = 5L;
        Long expectedValue = 20L;

        // Act
        Long result = basicCalculator.div(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }
}