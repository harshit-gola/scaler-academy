package library.users;

import library.User;

public class Member extends User {

    private final static int MAX_BORROW_LIMIT = 5;
    private int borrowedBooksCount;

    public Member(String name, String contactInfo, int borrowedBooksCount) {
        super(name, contactInfo);
        this.borrowedBooksCount = borrowedBooksCount;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Members Dashboard");
        System.out.println("Name: " + getName() + ", Contact: " + getContactInfo() + ", Books Borrowed: " + borrowedBooksCount);
    }

    @Override
    public boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }

    @Override
    public void returnBook() {
        borrowedBooksCount--;
    }
}
