import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class CalculatorTest {

    Calculator calc;

    @BeforeEach
    void setUp() {
        calc = Calculator.instance.get();
    }

    @Test
    @DisplayName("Умножение положительного числа")
    void givenPositiveNumbers_whenAdd_thenReturnMultiply() {

        //Arrange
        int a = 10;
        int b = 5;

        //Act
        int result = calc.multiply(a, b);

        //Assert
        assertThat(result).isEqualTo(50);
    }

    @Test
    @DisplayName("Умножение отрицательного числа")
    void givenNegativeNumbers_whenAdd_thenReturnMultiply() {

        //Arrange
        int a = -10;
        int b = 5;

        //Act
        int result = calc.multiply(a, b);

        //Assert
        assertThat(result).isEqualTo(-50);
    }

    @Test
    @DisplayName("Умножение на ноль")
    void givenNull_whenAdd_thenReturnMultiply() {

        //Arrange
        int a = 10;
        int b = 0;

        //Act
        int result = calc.multiply(a, b);

        //Assert
        assertThat(result).isEqualTo(0);
    }
}