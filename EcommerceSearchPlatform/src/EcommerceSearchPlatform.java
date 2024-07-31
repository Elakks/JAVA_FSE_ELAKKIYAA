public class EcommerceSearchPlatform {
    public static void main(String[] args) {
        // Create a product catalog instance
        ProductCatalog catalog = new ProductCatalog();

        // Add products to the catalog
        catalog.addProduct(new Product("001", "Laptop", 799.99));
        catalog.addProduct(new Product("002", "Smartphone", 299.99));
        catalog.addProduct(new Product("003", "Headphones", 89.99));

        // Display the catalog
        System.out.println("Product Catalog:");
        catalog.displayCatalog();

        // Search for products
        String searchTerm = "Smartphone";
        Product foundProduct = catalog.searchProductByName(searchTerm);

        // Display search result
        if (foundProduct != null) {
            System.out.println("\nSearch result for '" + searchTerm + "':");
            System.out.println(foundProduct);
        } else {
            System.out.println("\nProduct not found for search term '" + searchTerm + "'.");
        }
    }
}
