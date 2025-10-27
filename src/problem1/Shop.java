package problem1;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
  public static void main(String[] args) {
    ArrayList<Item> cart = new ArrayList();
    double total = 0;
    Item item;
    String itemName;
    double itemPrice;
    int quantity;
    Scanner scan = new Scanner(System.in);
    String keepShopping = "y";
    do {
      System.out.print("Enter the name of the item: ");
      itemName = scan.nextLine();
      System.out.print("Enter the unit price: ");
      itemPrice = scan.nextDouble();
      System.out.print("Enter the quantity: ");
      quantity = scan.nextInt();
      // *** create a new item and add it to the cart
      item = new Item(itemName, itemPrice, quantity);
      cart.add(item);

      total += itemPrice * quantity;
      // *** print the contents of the cart object using println
      System.out.println("The content of your cart till now : ");
      for (int i = 0; i < cart.size(); i++) {
        System.out.println(cart.get(i));
      }
      System.out.print("\n Continue shopping (y/n)? ");
      scan.nextLine();
      keepShopping = scan.nextLine();
    } while (keepShopping.equals("y"));
    System.out.println("Total price of the cart : $" + total);
  }
}
