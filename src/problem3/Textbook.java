public class Textbook extends Book {
  private String level;

  public Textbook(String title, String author, int nbrPages, int numRec, String level) {
    super(title, author, nbrPages, numRec);
    this.level = level;
  }
}
