public class Dictionnary extends Document {
  private String language;

  public Dictionnary(String title, int numRec, String language) {
    super(title, numRec);
    this.language = language;
  }
}
