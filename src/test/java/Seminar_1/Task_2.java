package Seminar_1;
/*
Нужно исправить пример, так чтобы метод не выбрасывал ошибку
 */
public class Task_2 {
    public static void main(String[] args) {
        assertConditionB();
    }
    public static void assertConditionB() {
        int x = -1;
        assert x <= 0 : "Переменная должна быть отрицательная";
        System.out.println("Утверждение assert успешно");
    }
}