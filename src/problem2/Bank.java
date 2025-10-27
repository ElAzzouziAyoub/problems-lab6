import java.util.ArrayList;

public class Bank {
  private ArrayList<Customer> customers;
  private String name;

  public void addCustomer(Customer e) {
    customers.add(e);
  }

  public Bank(String name) {
    this.name = name;
    customers = new ArrayList<Customer>();
  }

  public boolean addTransaction(Customer e, double transac) {
    for (int i = 0; i < customers.size(); i++) {
      if (customers.get(i) == e) {
        e.getTransactions().add((Double) transac);
        return true;
      }
    }
    return false;
  }

  public void print() {
    for (Customer customer : customers) {
      System.out.println(customer);
    }
  }
}
