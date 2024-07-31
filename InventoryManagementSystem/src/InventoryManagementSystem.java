public class InventoryManagementSystem {
    public static void main(String[] args) {
        // Create inventory instance
        Inventory inventory = new Inventory();

        // Create some products
        Product product1 = new Product("001", "Laptop", 10, 799.99);
        Product product2 = new Product("002", "Smartphone", 25, 299.99);

        // Add products to inventory
        inventory.addProduct(product1);
        inventory.addProduct(product2);

        // Display the inventory
        System.out.println("Inventory after adding products:");
        inventory.displayInventory();

        // Update product quantity
        product1.setQuantity(8);
        inventory.updateProduct(product1);

        // Display the inventory after update
        System.out.println("\nInventory after updating product:");
        inventory.displayInventory();

        // Delete a product
        inventory.deleteProduct("002");

        // Display the inventory after deletion
        System.out.println("\nInventory after deleting product:");
        inventory.displayInventory();
    }
}
