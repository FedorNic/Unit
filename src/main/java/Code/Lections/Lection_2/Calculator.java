package Code.Lections.Lection_2;

import java.util.Scanner;

// Класс CalculatorTest перенесен в тестовую папку
public class Calculator {
    private static final Scanner scanner = new Scanner(System.in);

    public static char getOperation() {
        System.out.println("Введите операцию: ");
        char operation = scanner.next().charAt(0);
        return operation;
    }

    public static int getNumber() {
        System.out.println("Введите число: ");
        int operand;
        if (scanner.hasNextInt()) {
            operand = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа");
            if (scanner.hasNextInt()) {
                scanner.nextInt();
                operand = getOperation();
            } else {
                throw new IllegalStateException("Ты тупой??");
            }
        }
        return operand;
    }

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

    public static void main(String[] args) {
        int result = calculator(getNumber(), getNumber(), getOperation());
        System.out.println(result);
    }
}