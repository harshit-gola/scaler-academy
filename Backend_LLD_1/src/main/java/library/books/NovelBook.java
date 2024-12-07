package library.books;

import library.Book;

public class NovelBook extends Book {

    String genre;

    public NovelBook(String isbn, String title, String author, String genre) {
        super(isbn, title, author);
        this.genre = genre;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("ISBN: " + this.getIsbn() + " Title: " + this.getTitle() + " Author: " + this.getAuthor() + " Genre: " + this.genre);
    }
}
