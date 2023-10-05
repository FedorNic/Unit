package Lection_3;

import Code.Lections.Lection_3.Calculator;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {


    // <-------JUnit-Jupiter-Params
//    @ParameterizedTest
//    @ValueSource(chars = {'&', '#', '='})
//    void expectedIllegalStateExpressionToo(char i) {
//        // Arrange
//        Calculator calculator = new Calculator();
//        char o = i;
//
//        // Act
//        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> {
//            Calculator.calculator(8, 4, o);
//        });
//
//        // Assert
//        String expectedMessage = "Unexpected value operator: " + o;
//        String actualMessage = exception.getMessage();
//
//        assertEquals(expectedMessage, actualMessage);
//    }

    @Test
    void computeAreaCircle() {
        Calculator calculator = new Calculator();
        assertEquals(314.1592653589793, calculator.computeAreaCircle(10), "Should return right circle area");
    }

    //HW3.1L: Попробуйте реализовать в калькуляторе с помощью методологии TDD (с описанием шагов) функцию расчета длины окружности
    // P=2πR
    @Test
    void computeLengthCircle() {
        Calculator calculator = new Calculator();
        assertThat(calculator.computeLengthCircle(10)).isEqualTo(62.83185307179586);
        assertTrue(Math.abs(62 - calculator.computeLengthCircle(10)) < 1);
    }
}