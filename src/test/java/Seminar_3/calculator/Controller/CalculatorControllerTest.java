package Seminar_3.calculator.Controller;


import Code.Seminars.Seminar_3.calculator.Controller.CalculatorController;
import Code.Seminars.Seminar_3.calculator.Model.CalculatorModel;
import Code.Seminars.Seminar_3.calculator.Model.DivisionByZeroException;
import Code.Seminars.Seminar_3.calculator.Model.InvalidOperatorException;
import Code.Seminars.Seminar_3.calculator.View.CalculatorView;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorControllerTest {

    private CalculatorController calculatorController;
    @BeforeEach
    public void setUp() {
        calculatorController = new CalculatorController(new CalculatorModel(), new CalculatorView());
    }

    @Test
    public void calculateAdd() {
        assertEquals(4, calculatorController.calculate(2,2,"+"));
    }

    @Test
    public void calculateSubtract() {
        assertEquals(0, calculatorController.calculate(2,2,"-"));
    }

    @Test
    public void calculateMultiply() {
        assertEquals(4, calculatorController.calculate(2,2,"*"));
    }

    @Test
    public void calculateDivide() {
        assertEquals(2, calculatorController.calculate(4,2,"/"));
    }

    @Test
    public void calculateNull() {
        assertThatThrownBy(() -> calculatorController.calculate(8, 0, "/"))
                .isInstanceOf(DivisionByZeroException.class);
    }

    @Test
    public void calculateCheck() {
        assertThatThrownBy(() -> calculatorController.calculate(8, 0, "^"))
                .isInstanceOf(InvalidOperatorException.class);

        assertThatThrownBy(() -> calculatorController.calculate(8, 0, ""))
                .isInstanceOf(InvalidOperatorException.class);

        assertThatThrownBy(() -> calculatorController.calculate(8, 0, "_"))
                .isInstanceOf(InvalidOperatorException.class);
    }
}