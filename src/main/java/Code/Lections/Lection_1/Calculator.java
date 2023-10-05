package Code.Lections.Lection_1;

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
//            Домашка из лекции: Придумайте и опишите (можно в псевдокоде) функцию извлечения корня и
//            необходимые проверки для него используя граничные случаи
        public static double squareRootExtraction(double num) {
            //  0
            //  Отрицательные числа
            //  Дробные значения корней
            //  Целые
            if(num < 0) {
                throw new IllegalArgumentException("Cannot calculate square root of a negative number");
            }
            return Math.sqrt(num);
        }
}