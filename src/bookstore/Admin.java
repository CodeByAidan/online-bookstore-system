public class Admin extends User {
    public Admin(String username, String password) {
        super(username, password);
    }

    public void addBookToInventory(Book book) {
        // Logic for adding a book to the inventory
        System.out.println("Added " + book.getTitle() + " to inventory.");
    }
}
