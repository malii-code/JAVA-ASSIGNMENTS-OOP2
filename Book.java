//MALII STEPHEN MUUNGAMI
//CT100/G/22156/24
// Book class
public class Book {

    private String title;
    private String author;
    private String isbn;
    private boolean isIssued;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isIssued = false;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void issueBook() {
        isIssued = true;
    }

    public void returnBook() {
        isIssued = false;
    }

    public void displayBookInfo() {
        System.out.println(title + " by " + author +
                " | ISBN: " + isbn +
                " | Issued: " + isIssued);
    }
}
