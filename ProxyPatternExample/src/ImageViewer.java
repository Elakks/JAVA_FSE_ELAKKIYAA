public class ImageViewer {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("test_image1.jpg");
        Image image2 = new ProxyImage("test_image2.jpg");

        // Image will be loaded from disk and then displayed
        image1.display();
        // Image will not be loaded again, just displayed
        image1.display();

        // Image will be loaded from disk and then displayed
        image2.display();
        // Image will not be loaded again, just displayed
        image2.display();
    }
}
