package Seminar_2;

import Code.Seminars.Seminar_2.SomeClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSomeClass {

    // Обозначение метода, который выполняется перед каждым тестовым методом в классе
    @BeforeEach
    public void setUp() {
// Выполните предварительные настройки здесь, если необходимо
    }

    @Test
    public void testSomeFeature() {
// Код для проверки какой-то функциональности
        int result = SomeClass.someMethod();

// Проверка результата с использованием утверждений (assertions)
        assertEquals(42, result);
    }
}

