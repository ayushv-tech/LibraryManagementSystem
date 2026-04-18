import java.util.*;

class Library {
    ArrayList<Book> books = new ArrayList<>();

    // Add Book
    void addBook(Book b) {
        books.add(b);
        System.out.println("Book Added Successfully!");
    }

    // Show All Books
    void showBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available!");
            return;
        }

        for (Book b : books) {
            System.out.println(b.id + " | " + b.name + " | " + b.author);
        }
    }

    // Search Book
    void searchBook(String name) {
        for (Book b : books) {
            if (b.name.equalsIgnoreCase(name)) {
                System.out.println("Found: " + b.name + " by " + b.author);
                return;
            }
        }
        System.out.println("Book Not Found!");
    }

    // Remove Book
    void removeBook(int id) {
        boolean removed = books.removeIf(b -> b.id == id);

        if (removed) {
            System.out.println("Book Removed!");
        } else {
            System.out.println("Book Not Found!");
        }
    }
}
