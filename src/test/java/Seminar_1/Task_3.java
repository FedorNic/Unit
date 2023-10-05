package Seminar_1;

/*
Нужно исправить метод сложения двух чисел так, чтобы при переполнении переменной
(Запустить пример  System.out.println(sum(2_147_483_647, 2)) ) выбрасывалось предупреждение
 */
public class Task_3 {
    public static void main(String[] args) {
        System.out.println(sum(2_147_483_647, 2));
    }

    public static int sum(int a, int b) {
        assert a + b > Integer.MAX_VALUE : "Слишком большое число";
            return a + b;
    }
}
