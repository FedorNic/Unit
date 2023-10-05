package Code.Lections.Lection_1;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorTest {

    public static void main(String[] args) {
        /*Ручное тестирование (глазами проверяем результаты работы метода)*/
//        System.out.println("Результат операции: " + Calculator.calculator(2, 2, '+'));
//        System.out.println("Результат операции: " + Calculator.calculator(4, 2, '-'));
//        System.out.println("Результат операции: " + Calculator.calculator(3, 2, '*'));
//        System.out.println("Результат операции: " + Calculator.calculator(8, 2, '/'));

//        ------------------------------------------------
        /*Ручное тестирование (негативное утверждение)*/
        // Проверка базового функционала с целыми числами:
//        if (4 != Calculator.calculator(2, 2, '+')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//        if (2 != Calculator.calculator(4, 2, '-')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//        if (6 != Calculator.calculator(3, 2, '*')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//        if (4 != Calculator.calculator(8, 2, '/')) {
//            throw new AssertionError("Ошибка в методе");
//        }
        // Случаи с неправильными аргументами
//        try {
//            Calculator.calculator(8, 4, '_');
//        } catch (IllegalStateException e) {
//            if (e.getMessage().equals("Unexpected value operator")) {
//                throw new AssertionError("Ошибка в методе");
//            }
//        }
//        ------------------------------------------------
        /*Ручное тестирование (позитивное утверждение)*/
        // Проверка базового функционала с целыми числами, с использованием утверждений:
//        assert нужно включать в настройках!!
//        assert 4 == Calculator.calculator(2, 2, '+');
//        assert 2 == Calculator.calculator(4, 2, '-');
//        assert 6 == Calculator.calculator(3, 2, '*');
//        assert 5 == Calculator.calculator(8, 2, '/');

        // Проверка базового функционала с целыми числами, с использованием утверждений AssertJ:
        assertThat(Calculator.calculator(2, 2, '+')).isEqualTo(4);
        assertThat(Calculator.calculator(4, 2, '-')).isEqualTo(2);
        assertThat(Calculator.calculator(3, 2, '*')).isEqualTo(6);
        assertThat(Calculator.calculator(8, 2, '/')).isEqualTo(4);

        // Проверка ожидаемого исключения, с использованием утверждений AssertJ:
//        assertThatThrownBy(() ->
//                Calculator.calculation(8, 4, '_')
//        ).isInstanceOf(IllegalStateException.class);

//        Примерные решения домашних заданий из 1 лекции:
//
//        HW1 .1:Придумайте и опишите(можно в псевдокоде) функцию извлечения корня и
//        необходимые проверки для него используя граничные случаи
//        assertThatThrownBy(() ->
//                seminars.first.Calculator.Calculator.squareRootExtraction(0, 1, -1)
//        ).isInstanceOf(SomeStateException.class);

//        HW1 .2:Как будет выглядеть проверка для случая деления на ноль ? (с использованием AssertJ)
//        assertThatThrownBy(() ->
//                seminars.first.Calculator.Calculator.calculation(5, 0, '/')
//        ).isInstanceOf(ArithmeticException.class);

//        HW1 .3:Сравните одну и ту же проверку с использованием условий, ассертов, AssertJ
//        в каком случае стандартное сообщение об ошибке будет более информативным?
//        if (0 != seminars.first.Calculator.Calculator.calculation(2, 6, '+')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//        assert 0 == seminars.first.Calculator.Calculator.calculation(2, 6, '+');
//        assertThat(seminars.first.Calculator.Calculator.calculation(2, 6, '+')).isEqualTo(0);
    }
}