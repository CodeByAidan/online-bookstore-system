public class Payment {
    public static boolean processPayment(Customer customer, double amount) {
        // Logic for processing a payment
        System.out.println("Processed payment of $" + String.format("%.2f", amount) + " for " + customer.getUsername());
        return true;
    }
}
