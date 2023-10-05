package Code.Lections.Lection_3;

import java.util.Scanner;

// Класс CalculatorTest перенесен в тестовую папку
public class Calculator {

    public static int calculator(int first, int second, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                if (second != 0) {
                    result = first / second;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator");
        }
        return result;
    }
    //HW2.3L: Добавьте функцию возведения в степень в калькулятор и протестируйте
    public static int pow(int value, int powValue) {
        int result = 1;

        for (int a = 1; a <= powValue; a++) {
            if (a == 0) return 1;
            result = result * value;

        }
        return result;
    }

    public double computeAreaCircle(double radius) {
        return Math.PI * radius * radius;
    }

    //HW3.1L: Попробуйте реализовать в калькуляторе с помощью методологии TDD (с описанием шагов) функцию расчета длины окружности
    // P=2πR
    public double computeLengthCircle(int r) {
        return 2*Math.PI*r;
    }
}