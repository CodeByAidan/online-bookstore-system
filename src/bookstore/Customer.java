public class Customer extends User {
    private String email;

    public Customer(String username, String password, String email) {
        super(username, password);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void purchaseBook(Book book) {
        // Logic for purchasing a book
        System.out.println(getUsername() + " purchased " + book.getTitle());
    }
}
