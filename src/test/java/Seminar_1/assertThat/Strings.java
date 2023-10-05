package Seminar_1.assertThat;

import static org.assertj.core.api.Assertions.assertThat;

public class Strings {
    public static void main(String[] args) {
        // Создаем строку для тестирования
        String text = "Hello, World";

        // Проверяем, что строка не равна null
        assertThat(text).isNotNull();

        // Проверяем, что строка начинается с "Hello"
        assertThat(text).startsWith("Hello");

        // Проверяем, что строка заканчивается на "World"
        assertThat(text).endsWith("World");

        // Проверяем, что строка содержит подстроку "lo, W"
        assertThat(text).contains("lo, W");

        // Проверка на равенство строки
        assertThat(text).isEqualTo("Hello, World");

        // Проверка на длину строки
        assertThat(text).hasSize(12);
    }
}
