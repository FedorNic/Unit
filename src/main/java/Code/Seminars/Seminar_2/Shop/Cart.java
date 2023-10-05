package Code.Seminars.Seminar_2.Shop;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс "Корзина" представляет собой список продуктов в виде ArrayList.
 */
public class Cart {
    private List<Product> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addProduct(Product product) {
        items.add(product);
    }

    public void removeProduct(Product product) {
        items.remove(product);
    }

    public List<Product> getItems() {
        return items;
    }

    /**
     * Расчет общей цены всех продуктов, имеющихся в списке
     */
    public double calculateTotal() {
        double total = 0.0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }
}