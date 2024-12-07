package library;

public abstract class Book implements Lendable {
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    Book() {
        this.isAvailable = true;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Book(String isbn, String title, String author) {
        this.isAvailable = true;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book(Book otherBook) {
        this.isAvailable = otherBook.isAvailable;
        this.isbn = otherBook.isbn;
        this.title = otherBook.title;
        this.author = otherBook.author;
    }

    @Override
    public boolean lend(User user) {
        if (user.canBorrowBooks() && isAvailable()) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    @Override
    public void returnBook(User user) {
        isAvailable = true;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    public abstract void displayBookDetails();
}
