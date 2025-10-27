import java.util.ArrayList;

public class Customer {
  private ArrayList<Double> transactions;
  private String name;

  public ArrayList<Double> getTransactions() {
    return this.transactions;
  }

  public Customer(String name) {
    this.name = name;
    this.transactions = new ArrayList<Double>();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("------------------------------------\n");
    sb.append(this.name);
    for (Double e : this.transactions) {
      sb.append(" " + (double) e + " ");
    }
    sb.append("\n------------------------------------\n");

    return sb.toString();
  }
}
