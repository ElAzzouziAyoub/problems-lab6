import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Bank bank = new Bank("My Bank");

    Customer customer1 = new Customer("Ayoub");
    Customer customer2 = new Customer("Haytam");
    Customer customer3 = new Customer("Ilyass");

    bank.addCustomer(customer1);
    bank.addCustomer(customer2);
    bank.addCustomer(customer3);

    bank.addTransaction(customer1, 45);
    bank.addTransaction(customer1, 54);
    bank.addTransaction(customer2, 405);
    bank.addTransaction(customer2, 12);
    bank.addTransaction(customer3, 26);
    bank.addTransaction(customer3, 91);
    bank.addTransaction(customer3, 100);

    bank.print();
  }
}
