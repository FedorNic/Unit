package Lection_2;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import Code.Lections.Lection_2.Calculator;
import org.junit.jupiter.api.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class CalculatorTest {

    @Test
    void evaluatesExpression() {
        assertThat(Calculator.calculator(2,6,'+')).isEqualTo(8);
    }
    @Test
    void subtractionExpression() {
        assertThat(Calculator.calculator(2,1,'-')).isEqualTo(1);
    }
    @Test
    void multiplicationExpression() {
        assertThat(Calculator.calculator(2,4,'*')).isEqualTo(8);
    }
    @Test
    void divisionExpression() {
        assertThat(Calculator.calculator(8,2,'/')).isEqualTo(4);
    }
    @Test
    void expectedIllegalStateExceptionOnInvalidOperatorSymbol() {
        assertThatThrownBy(() -> Calculator.calculator(8,4,'_')).isInstanceOf(IllegalStateException.class);
    }
    @Test
    void getOperandCompletesCorrectlyWithNumbers() {
        String testedValue = "9"; // Значение для тестов
        ByteArrayInputStream in = new ByteArrayInputStream(testedValue.getBytes());
        InputStream inputStream = System.in; // Сохраняем ссылку на ввод с клавиатуры
        System.setIn(in); // Подменяем ввод

        Calculator.getNumber(); // Вызываем метод

        System.out.println(testedValue);
        System.setIn(inputStream); // Подменяем обратно
    }

    @Test
    void getOperandCompletesCorrectlyWithNotNumbers() {
        String testedValue = "k";
        ByteArrayInputStream in = new ByteArrayInputStream(testedValue.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        InputStream inputStream = System.in;
        System.setIn(in);
        System.setOut(new PrintStream(out));

        assertThatThrownBy(() -> Calculator.getNumber()).isInstanceOf(IllegalStateException.class)
                .describedAs("Ошибка в вводимых данных");

        System.setIn(inputStream);
        System.setOut(null);
    }
}