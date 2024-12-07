package library;

import library.books.NovelBook;
import library.books.TextBook;
import library.users.Librarian;
import library.users.Member;

import java.util.List;

public class client {
    public static void main(String[] args) {
        TextBook textBook1 = new TextBook("123", "Game of thrones", "Will Smith", 2, "Action");
        TextBook textBook2 = new TextBook("999", "Friends", "Copper Roy", 1, "Drama");
        NovelBook novelBook1 = new NovelBook("252", "Do or Die", "James Head", "Fantasy");
        NovelBook novelBook2 = new NovelBook("200", "Atomic Habits", "Adam Christ", "Science");

        LibraryManagementSystem.addBook(textBook1);
        LibraryManagementSystem.addBook(textBook2);
        LibraryManagementSystem.addBook(novelBook1);
        LibraryManagementSystem.addBook(novelBook2);

        Member member1 = new Member("Roy", "928300121", 3);
        Member member2 = new Member("Charlie", "112349992", 1);
        Member member3 = new Member("Alexa", "99999933", 5);
        Librarian librarian1 = new Librarian("Rosie", "3337777", "641");
        Librarian librarian2 = new Librarian("Suzy", "2222222", "007");

        LibraryManagementSystem.registerUser(member1);
        LibraryManagementSystem.registerUser(member2);
        LibraryManagementSystem.registerUser(member3);
        LibraryManagementSystem.registerUser(librarian1);
        LibraryManagementSystem.registerUser(librarian2);

        System.out.println("---------Books----------");
        textBook1.displayBookDetails();
        textBook2.displayBookDetails();
        novelBook1.displayBookDetails();
        novelBook2.displayBookDetails();
        System.out.println();

        System.out.println("---------Users----------");
        member1.displayDashboard();
        member2.displayDashboard();
        librarian1.displayDashboard();
        librarian2.displayDashboard();

        System.out.println();
        if (textBook1.lend(member1)) {
            System.out.println("Member 1 lent textBook1 successfully");
        } else {
            System.out.println("Member 1 NOT lent textBook1 successfully");
        }
        if (textBook2.lend(member2)) {
            System.out.println("Member 2 lent textBook2 successfully");
        } else {
            System.out.println("Member 2 NOT lent textBook2 successfully");
        }
        if (textBook2.lend(member3)) {
            System.out.println("Member 3 lent textBook2 successfully");
        } else {
            System.out.println("Member 3 NOT lent textBook2 successfully");
        }

        System.out.println();
        System.out.println("---------All Books----------");
        LibraryManagementSystem.displayAllBooks();
        System.out.println("-----------------------------");
        System.out.println();
        System.out.println("---------All Users----------");
        LibraryManagementSystem.displayRegisteredUsers();
        System.out.println("-----------------------------");

        System.out.println();
        System.out.println("---------Search Books----------");
        List<Book> filteredBooks = LibraryManagementSystem.searchBooks("Game of thrones");
        System.out.println("Searched Book");
        for (Book book : filteredBooks) {
            book.displayBookDetails();
        }
    }

}
