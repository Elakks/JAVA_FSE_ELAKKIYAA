import java.util.List;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books to the library
        library.addBook(new Book("B001", "Java Programming", "John Doe"));
        library.addBook(new Book("B002", "Python Programming", "Jane Doe"));
        library.addBook(new Book("B003", "Algorithms", "Alice Smith"));
        library.addBook(new Book("B004", "Data Structures", "Bob Johnson"));
        library.addBook(new Book("B005", "Java Programming", "Mary Johnson"));

        // Search for books by title using linear search
        System.out.println("Linear Search: Java Programming");
        List<Book> linearSearchResults = library.searchByTitleLinear("Java Programming");
        library.displayBooks(linearSearchResults);

        // Search for books by title using binary search
        System.out.println("\nBinary Search: Python Programming");
        List<Book> binarySearchResults = library.searchByTitleBinary("Python Programming");
        library.displayBooks(binarySearchResults);
    }
}
