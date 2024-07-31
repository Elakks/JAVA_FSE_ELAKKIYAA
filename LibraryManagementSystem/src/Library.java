import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> searchByTitleLinear(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> searchByTitleBinary(String title) {
        Collections.sort(books, Comparator.comparing(Book::getTitle));
        List<Book> result = new ArrayList<>();
        int index = binarySearch(books, title, 0, books.size() - 1);
        if (index != -1) {
            result.add(books.get(index));
        }
        return result;
    }

    private int binarySearch(List<Book> books, String title, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (books.get(mid).getTitle().equalsIgnoreCase(title)) {
                return mid;
            }
            if (books.get(mid).getTitle().compareToIgnoreCase(title) > 0) {
                return binarySearch(books, title, left, mid - 1);
            }
            return binarySearch(books, title, mid + 1, right);
        }
        return -1;
    }

    public void displayBooks(List<Book> bookList) {
        if (bookList.isEmpty()) {
            System.out.println("No books found.");
        } else {
            for (Book book : bookList) {
                System.out.println(book);
            }
        }
    }
}
