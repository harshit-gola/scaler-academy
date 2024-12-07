package library;

import library.books.NovelBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LibraryManagementSystem {
    static List<Book> bookInventory;
    static List<User> registeredUsers;

    static {
        bookInventory = new ArrayList<>();
        registeredUsers = new ArrayList<>();
    }

    static void addBook(Book book) {
        bookInventory.add(book);
    }

    static void registerUser(User user) {
        registeredUsers.add(user);
    }

    static List<Book> searchBooks(String criteria) {
        List<Book> books = new ArrayList<>();
        for (Book book : bookInventory) {
            if (book.getAuthor().toLowerCase().contains(criteria.toLowerCase()) ||
                book.getTitle().toLowerCase().contains(criteria.toLowerCase())) {
                books.add(book);
            }
        }
        return books;
    }

    static List<Book> searchBooks(String criteria, String type) {
        List<Book> books = new ArrayList<>();
        if (type.equals(BookTypes.TextBook)) {
            for (Book book : bookInventory) {
                if (book.getAuthor().toLowerCase().contains(criteria.toLowerCase()) ||
                        book.getTitle().toLowerCase().contains(criteria.toLowerCase())) {
                    books.add(book);
                }
            }
        } else if (type.equals(BookTypes.NovelBook)) {
            for (Book book : bookInventory) {
                if (book.getAuthor().toLowerCase().contains(criteria.toLowerCase()) ||
                        book.getTitle().toLowerCase().contains(criteria.toLowerCase())) {
                    books.add(book);
                }
            }
        }
        return books;
    }

    static void displayAllBooks() {
        for (Book book : bookInventory) {
            book.displayBookDetails();
        }
    }

    static void displayRegisteredUsers() {
        for (User user : registeredUsers) {
            user.displayDashboard();
        }
    }
}
