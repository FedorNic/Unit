package Seminar_2.Shop;

import Code.Seminars.Seminar_2.Shop.Cart;
import Code.Seminars.Seminar_2.Shop.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Тестовый класс для класса Cart.
 */
public class CartTest {
    private Cart cart;

    // Перед КАЖДЫМ тестом создает новый "чистый" экземпляр класса (изоляция тестов друг от друга)
    @BeforeEach
    public void setUp() {
        cart = new Cart();
    }

    /**
     * Тест на добавление продукта в корзину.
     */
    @Test
    public void testAddProduct() {
        Product product = new Product(1, "Test Product", 10.0, 5);
        cart.addProduct(product);

        // Проверка количества продуктов в корзине
        assertEquals(1, cart.getItems().size());
    }

    /**
     * Тест на удаление продукта из корзины.
     */
    @Test
    public void testRemoveProduct() {
        Product product = new Product(1, "Test Product", 10.0, 5);
        cart.addProduct(product);
        cart.removeProduct(product);

        // Проверка количества продуктов в корзине после удаления
        assertEquals(0, cart.getItems().size());
    }

        // Другие тесты для класса Cart
}