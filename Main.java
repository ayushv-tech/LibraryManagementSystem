import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        while (true) {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add Book");
            System.out.println("2. Show Books");
            System.out.println("3. Search Book");
            System.out.println("4. Remove Book");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    lib.addBook(new Book(id, name, author));
                    break;

                case 2:
                    lib.showBooks();
                    break;

                case 3:
                    System.out.print("Enter book name: ");
                    String search = sc.nextLine();
                    lib.searchBook(search);
                    break;

                case 4:
                    System.out.print("Enter ID to remove: ");
                    int rid = sc.nextInt();
                    lib.removeBook(rid);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
