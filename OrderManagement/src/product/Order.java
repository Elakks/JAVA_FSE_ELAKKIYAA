package product;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private int orderId;
    private String productName;
    private int quantity;
    private double price;

    public Order(int orderId, String productName, int quantity, double price) {
        this.orderId = orderId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}

class OrderManager {
    private List<Order> orders;

    public OrderManager() {
        orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void displayOrders() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager();

        // Adding sample orders
        orderManager.addOrder(new Order(1, "Product A", 2, 10.99));
        orderManager.addOrder(new Order(2, "Product B", 1, 5.99));
        orderManager.addOrder(new Order(3, "Product C", 3, 7.49));

        // Displaying orders
        System.out.println("Orders: ");
        orderManager.displayOrders();
    }
}

