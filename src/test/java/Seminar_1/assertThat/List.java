package Seminar_1.assertThat;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class List {
    public static void main(String[] args) {
        java.util.List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

    // Проверка на наличие элемента
        assertThat(numbers).contains(2);

    // Проверка на отсутствие элемента
        assertThat(numbers).doesNotContain(4);

    // Проверка размера коллекции
        assertThat(numbers).hasSize(3);

    // Проверка на пустоту коллекции
        assertThat(numbers).isNotEmpty();
    }
}
