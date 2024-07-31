public class TestBuilderPattern {
    public static void main(String[] args) {
        Computer computer1 = new Computer.Builder("Intel Core i7", "16GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA GTX 1660")
                .setOperatingSystem("Windows 10")
                .build();

        Computer computer2 = new Computer.Builder("AMD Ryzen 5", "8GB")
                .setStorage("512GB SSD")
                .build();

        System.out.println(computer1);
        System.out.println(computer2);
    }
}
