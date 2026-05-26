import java.util.Map;
import java.util.TreeMap;

public class StoreSales {

    public static void main(String[] args) {
        // TreeMap ensures that the products (keys) are stored in natural alphabetical order
        TreeMap<String, Integer> sales = new TreeMap<>();

        addSale(sales, "Яблоки", 5);
        addSale(sales, "Молоко", 2);
        addSale(sales, "Хлеб", 3);
        addSale(sales, "Яблоки", 10);
        addSale(sales, "Вода", 1);

        System.out.println("--- Список проданных товаров ---");
        // Iterating through Map.Entry to print keys and values
        for (Map.Entry<String, Integer> entry : sales.entrySet()) {
            System.out.println("Товар: " + entry.getKey() + " | Продано: " + entry.getValue() + " шт.");
        }

        int totalItemsSold = 0;

        // Iterating over map values directly to calculate total sales
        for (int count : sales.values()) {
            totalItemsSold += count;
        }
        System.out.println("\nОбщее количество проданных товаров (сумма): " + totalItemsSold + " шт.");

        String mostPopularProduct = "";
        int maxSales = 0;

        // Finding the product with the highest sales volume
        for (Map.Entry<String, Integer> entry : sales.entrySet()) {
            if (entry.getValue() > maxSales) {
                maxSales = entry.getValue();
                mostPopularProduct = entry.getKey();
            }
        }
        System.out.println("Самый популярный товар: " + mostPopularProduct + " (продано " + maxSales + " шт.)");
    }

    // Helper method to add sales using getOrDefault to handle non-existing keys gracefully
    public static void addSale(TreeMap<String, Integer> sales, String product, int count) {
        sales.put(product, sales.getOrDefault(product, 0) + count);
    }
}
