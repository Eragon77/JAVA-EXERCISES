package package2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> map = new HashMap<>();
    private Map<String, Integer> stockbalance = new HashMap<>();


    public void addProduct(String product, int price, int stock) {
        this.map.put(product, price);
        this.stockbalance.put(product, stock);
    }

    public int price(String product) {
        return this.map.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return this.stockbalance.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        int currentStock = this.stockbalance.getOrDefault(product, 0);
        if (currentStock > 0) {
            this.stockbalance.put(product, currentStock - 1); // Riduce lo stock
            return true;
        }
        return false; // Stock insufficiente
    }

    public Set<String> products(){
        return this.map.keySet();
    }
}

