package Seminar_3.calculator.Additional;

import Code.Seminars.Seminar_3.calculator.Additional.AdditionalClass2;
import Code.Seminars.Seminar_3.calculator.Model.DivisionByZeroException;
import Code.Seminars.Seminar_3.calculator.Model.InvalidOperatorException;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


class AdditionalClass2Test {
    // Проверка на арифметику
    @Test
    void customOperation() {
        assertThat(AdditionalClass2.customOperation(6, 2)).isEqualTo(3);
    }

    // Проверка на деление на ноль
    @Test
    void customOperationDivisionByZero() {
        assertThatThrownBy(() -> AdditionalClass2.customOperation(8, 0)).isInstanceOf(ArithmeticException.class);
    }
}