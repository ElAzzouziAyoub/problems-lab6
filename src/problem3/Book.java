public class Book extends Document {

  private String author;
  private int nbrPages;

  public Book(String title, String author, int nbrPages, int numRec) {
    super(title, numRec);
    this.author = author;
    this.nbrPages = nbrPages;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();

    sb.append("Book : ");
    sb.append(this.getTitle() + " " + this.author + " ");
    sb.append(nbrPages + " pages \n");
    return sb.toString();
  }
}
