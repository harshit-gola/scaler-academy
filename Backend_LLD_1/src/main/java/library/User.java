package library;

public abstract class User {
    private final String userId;
    private String name;
    private String contactInfo;
    static int totalUsers;
    private static final String unqiueIdString = "USER-";

    User() {
        this.userId = generateUniqueId();
    }

    public User(String name, String contactInfo) {
        this.userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
    }

    User(User other) {
        this.userId = generateUniqueId();
        this.name = other.name;
        this.contactInfo = other.contactInfo;
    }

    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();
    public abstract void returnBook();

    final String generateUniqueId() {
        return unqiueIdString + ++totalUsers;
    }

    static int getTotalUsers() {
        return totalUsers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
