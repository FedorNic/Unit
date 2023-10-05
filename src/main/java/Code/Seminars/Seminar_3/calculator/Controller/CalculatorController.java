package Code.Seminars.Seminar_3.calculator.Controller;

import Code.Seminars.Seminar_3.calculator.Model.CalculatorModel;
import Code.Seminars.Seminar_3.calculator.Model.InvalidOperatorException;
import Code.Seminars.Seminar_3.calculator.Model.NegativeNumberException;
import Code.Seminars.Seminar_3.calculator.View.CalculatorView;

public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public int calculate(int num1, int num2, String operator) {
        int result;
        switch (operator) {
            case "+":
                result = model.add(num1, num2);
                break;
            case "-":
                result = model.subtract(num1, num2);
                break;
            case "*":
                result = model.multiply(num1, num2);
                break;
            case "/":
                result = model.divide(num1, num2);
                if (result < 0) {
                    throw new NegativeNumberException("Результат отрицателен");
                }
                break;
            case "^":
                throw new InvalidOperatorException("Оператор '^' не поддерживается");
            case "":
                throw new InvalidOperatorException("Оператор не указан");
            default:
                throw new InvalidOperatorException("Недопустимый оператор: " + operator);
        }
        view.printResult(result);
        return result;
    }
}