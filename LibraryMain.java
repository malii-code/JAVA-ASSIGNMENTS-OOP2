//MALII STEPHEN MUUNGAMI
//CT100/G/22156/24
public class LibraryMain {

    public static void main(String[] args) {

        Library lib = new Library();

        // Create books
        Book b1 = new Book("Java", "James", "111");
        Book b2 = new Book("Networks", "Tom", "222");
        Book b3 = new Book("Database", "Anna", "333");

        // Add books
        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);

        // Issue and return
        lib.issueBook("111");
        lib.returnBook("111");

        // Display available books
        System.out.println("Available books:");
        lib.listAvailableBooks();
    }
}
