import java.util.HashMap;
import java.util.Map;

public class ProductCatalog {
    private Map<String, Product> productMap;

    public ProductCatalog() {
        productMap = new HashMap<>();
    }

    public void addProduct(Product product) {
        productMap.put(product.getName().toLowerCase(), product);
    }

    public Product searchProductByName(String name) {
        return productMap.get(name.toLowerCase());
    }

    public void displayCatalog() {
        for (Product product : productMap.values()) {
            System.out.println(product);
        }
    }
}
