public class Novel extends Book {
  private double price;

  public Novel(String title, String author, int numPages, int numRec, double price) {
    super(title, author, numPages, numRec);
    this.price = price;
  }
}
