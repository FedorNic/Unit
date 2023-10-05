package Seminar_3.calculator.Additional;

import Code.Seminars.Seminar_3.calculator.Additional.AdditionalClass1;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AdditionalClass1Test {
    // Проверка на арифметику
    @Test
    void customOperation() {
        assertThat(AdditionalClass1.customOperation(2, 6)).isEqualTo(8);
    }

    // Проверка на превышение передаваемого числа относительно Integer.MAX_VALUE
    @Test
    void customOperationMaxValue() {
        assertThat(AdditionalClass1.customOperation(2, 6)).isLessThan(Integer.MAX_VALUE);
        //Другой вариант проверки
        //assert Integer.MAX_VALUE > AdditionalClass1.customOperation(Integer.MAX_VALUE - 2, 1);
    }
}