public class SortingTest {
    public static void main(String[] args) {
        // Create some sample orders
        Order[] orders = {
            new Order("001", "Alice", 120.50),
            new Order("002", "Bob", 75.00),
            new Order("003", "Charlie", 200.00),
            new Order("004", "David", 50.00)
        };

        System.out.println("Original Orders:");
        printOrders(orders);

        // Sort orders using Bubble Sort
        BubbleSort.sort(orders);
        System.out.println("\nOrders Sorted by Bubble Sort:");
        printOrders(orders);

        // Re-create orders for Quick Sort
        orders = new Order[]{
            new Order("001", "Alice", 120.50),
            new Order("002", "Bob", 75.00),
            new Order("003", "Charlie", 200.00),
            new Order("004", "David", 50.00)
        };

        // Sort orders using Quick Sort
        QuickSort.sort(orders, 0, orders.length - 1);
        System.out.println("\nOrders Sorted by Quick Sort:");
        printOrders(orders);
    }

    private static void printOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
