import java.util.Scanner;

public class main {
  public static void main(String[] args) {

    Library lib = new Library(20);

    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.println("\n1. Add Document");
      System.out.println("2. Add Book");
      System.out.println("3. Add Novel");
      System.out.println("4. Add TextBook");
      System.out.println("5. Add Magazine");
      System.out.println("6. Add Dictionnary ");
      System.out.println("7. Display authors");
      System.out.println("8. Exit");
      System.out.print("Choose option: ");
      int choice = sc.nextInt();
      sc.nextLine(); // clear newline

      if (choice == 1) {
        String title;
        int numRec;
        System.out.println("Enter title : ");
        title = sc.nextLine();
        System.out.println("Enter numRec : ");
        numRec = sc.nextInt();
        sc.nextLine(); // clear line

        Document doc = new Document(title, numRec);
        lib.addDocument(doc);

      } else if (choice == 2) {

        String title;
        int numRec;
        String author;
        int nbrPages;

        System.out.println("Enter title : ");
        title = sc.nextLine();
        System.out.println("Enter numRec : ");
        numRec = sc.nextInt();
        sc.nextLine(); // clear line
        System.out.println("Enter number of pages : ");
        nbrPages = sc.nextInt();
        sc.nextLine(); // clear line
        System.out.println("Enter author name : ");
        author = sc.nextLine();

        Book book = new Book(title, author, nbrPages, numRec);

        lib.addDocument(book);
      } else if (choice == 3) {

        String title;
        int numRec;
        String author;
        int nbrPages;
        double price;

        System.out.println("Enter title : ");
        title = sc.nextLine();
        System.out.println("Enter numRec : ");
        numRec = sc.nextInt();
        sc.nextLine(); // clear line
        System.out.println("Enter number of pages : ");
        nbrPages = sc.nextInt();
        sc.nextLine(); // clear line
        System.out.println("Enter author name : ");
        author = sc.nextLine();
        System.out.println("Enter price");
        price = sc.nextDouble();
        sc.nextLine(); // clear line

        Book novel = new Novel(title, author, nbrPages, numRec, price);

        lib.addDocument(novel);

      } else if (choice == 4) {

        String title;
        int numRec;
        String author;
        int nbrPages;
        String level;

        System.out.println("Enter title : ");
        title = sc.nextLine();
        System.out.println("Enter numRec : ");
        numRec = sc.nextInt();
        sc.nextLine(); // clear line
        System.out.println("Enter number of pages : ");
        nbrPages = sc.nextInt();
        sc.nextLine(); // clear line
        System.out.println("Enter author name : ");
        author = sc.nextLine();
        System.out.println("Enter level : ");
        level = sc.nextLine();

        Book textbook = new Textbook(title, author, nbrPages, numRec, level);

        lib.addDocument(textbook);
      } else if (choice == 5) {

        String title;
        int numRec;
        String month;
        int year;

        System.out.println("Enter title : ");
        title = sc.nextLine();
        System.out.println("Enter numRec : ");
        numRec = sc.nextInt();
        sc.nextLine(); // clear line
        System.out.println("Enter the month : ");
        month = sc.nextLine();
        System.out.println("Enter the year :");
        year = sc.nextInt();
        sc.nextLine(); // clear line

        Document magazine = new Magazine(title, numRec, month, year);

        lib.addDocument(magazine);

      } else if (choice == 6) {

        String title;
        int numRec;
        String language;

        System.out.println("Enter title : ");
        title = sc.nextLine();
        System.out.println("Enter numRec : ");
        numRec = sc.nextInt();
        sc.nextLine(); // clear line
        System.out.println("Enter language ");
        language = sc.nextLine();

        Document dict = new Dictionnary(title, numRec, language);

        lib.addDocument(dict);

      } else if (choice == 7) {
        lib.displayAuthors();

      } else if (choice == 8) {
        System.out.println("Exitig the application");
        break;
      }
    }

    sc.close();
  }
}
