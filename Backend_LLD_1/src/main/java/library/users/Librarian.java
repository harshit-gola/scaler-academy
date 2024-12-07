package library.users;

import library.Book;
import library.User;

public class Librarian extends User {

    private String employeeNumber;

    public Librarian(String name, String contactInfo, String employeeNumber) {
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Librarian dashboard" + ", Employee Number: " + employeeNumber);
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    void addNewBook(Book book) {
        System.out.println("Adding new book");
    }

    void removeBook(Book book) {
        System.out.println("Removing book");
    }

    @Override
    public void returnBook() {
        System.out.println("Returning book");
    }
}
