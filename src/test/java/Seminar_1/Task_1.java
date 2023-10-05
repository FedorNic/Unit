package Seminar_1;
/*
Задание: Используйте ключевое слово assert для проверки
вашего предположения в коде. Если утверждение не выполняется,
программа сгенерирует AssertionError. Сможете ли вы исправить
утверждение в этом коде, чтобы оно стало верным?
 */
public class Task_1 {
    public static void main(String[] args) {
        assertConditionA();
    }
    public static void assertConditionA() {
        String msg = "В неделе должно быть два дня";
        String[] weekends = {"Суббота", "Воскресенье"};
        assert weekends.length == 2 : msg;
        System.out.println("В неделе " + weekends.length + " дня выходных");
    }
}
