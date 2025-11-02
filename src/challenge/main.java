import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class main {
  static Scanner scan = new Scanner(System.in);
  static ArrayList<String> grocerylist = new ArrayList<>();

  public static void main(String[] args) {
    int choice;

    do {
      printMenu();
      choice = scan.nextInt();
      scan.nextLine();

      dispatch(choice);
    } while (choice != 0);
  }

  public static void dispatch(int choice) {
    String answer;
    String[] parts;

    switch (choice) {
      case 1:
        System.out.println("Enter the values you want to enter:");
        answer = scan.nextLine();
        parts = answer.trim().split("\\s+");
        grocerylist.addAll(Arrays.asList(parts));
        System.out.println("Updated list: " + grocerylist);
        break;

      case 2:
        System.out.println("Enter the values you want to remove:");
        answer = scan.nextLine();
        parts = answer.trim().split("\\s+");
        grocerylist.removeAll(Arrays.asList(parts));
        System.out.println("Updated list: " + grocerylist);
        break;

      case 0:
        break;

      default:
        System.out.println("Choix invalide ");
    }
  }

  public static void printMenu() {
    System.out.println("\nMenu");
    System.out.println("====");
    System.out.println("0: Quit");
    System.out.println("1: Add items to list");
    System.out.println("2: Remove items");
    System.out.println("Current list: " + grocerylist);
    System.out.print("Enter your input: ");
  }
}
