public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.history = new ChangeHistory();
        this.addToWarehouse(initialBalance);
        this.history.add(initialBalance);
    }

    public String history() {
        return this.history.toString();
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount); // Use parent method to add to warehouse
        double newBalance = this.getBalance(); // Get the updated balance
        this.history.add(newBalance); // Record the new balance in the history
    }

    public double takeFromWarehouse(double amount) {
        double removedAmount = super.takeFromWarehouse(amount); // Use parent method to remove from warehouse
        double newBalance = this.getBalance(); // Get the updated balance
        this.history.add(newBalance); // Record the new balance in the history
        return removedAmount; // Return the amount taken
    }
}