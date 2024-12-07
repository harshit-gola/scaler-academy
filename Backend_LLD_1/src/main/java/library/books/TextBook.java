package library.books;

import library.Book;

public class TextBook extends Book {
    String subject;
    int edition;

    public TextBook(String isbn, String title, String author, int edition, String subject) {
        super(isbn, title, author);
        this.edition = edition;
        this.subject = subject;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("ISBN: " + this.getIsbn() + " Title: " + this.getTitle() + " Author: " + this.getAuthor() + " Edition: " + this.edition + " Subject: " + this.subject);
    }
}
