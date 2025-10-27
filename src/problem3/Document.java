public class Document {

  private String title;
  private int numRec;
  private static int numEnrg = 0;

  public Document(String title, int numRec) {
    this.title = title;
    this.numRec = numRec;
    Document.numEnrg++;
  }

  public int getNum() {
    return this.numRec;
  }

  public String getTitle() {
    return this.title;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();

    sb.append("Document : " + this.title + " " + this.numRec + " \n");

    return sb.toString();
  }
}
