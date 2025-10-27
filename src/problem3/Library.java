import java.util.ArrayList;

public class Library {
  private int capacity;
  private ArrayList<Document> documents;

  public Library(int capacity) {
    this.capacity = capacity;
    this.documents = new ArrayList<Document>();
  }

  public void displayDocuments() {
    for (Document doc : this.documents) {
      System.out.println(doc);
    }
  }

  public boolean addDocument(Document doc) {
    if (this.documents.size() == capacity) {
      return false;
    }
    this.documents.add(doc);
    return true;
  }

  public boolean deleteDoc(Document doc) {
    for (int i = 0; i < this.documents.size(); i++) {
      if (this.documents.get(i) == doc) {
        this.documents.remove(i);
        return true;
      }
    }
    return false;
  }

  public Document document(int numEnrg) {
    for (Document doc : this.documents) {
      if (doc.getNum() == numEnrg) {
        return doc;
      }
    }
    return null;
  }

  public void displayAuthors() {
    for (Document doc : this.documents) {
      if (doc instanceof Book) {
        System.out.println(doc);
      }
    }
  }
}
