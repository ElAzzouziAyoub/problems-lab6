package problem5;

import java.util.LinkedList;

public class BookQueue {

  private LinkedList<Book> queue;

  public BookQueue() {
    this.queue = new LinkedList<Book>();
  }

  public void enqueue(Book book) {
    this.queue.addLast(book);
  }

  public Book dequeue() {
    if (!this.isEmpty()) {
      Book book = this.queue.getFirst();
      this.queue.removeFirst();
      return book;
    }
    return null;
  }

  public Book peek() {
    if (!this.isEmpty()) {
      return this.queue.getFirst();
    }
    return null;
  }

  public boolean isEmpty() {
    return this.queue.isEmpty();
  }

  public void display() {
    System.out.println("Queue contents (front to back):");
    for (Book book : this.queue) {
      System.out.println(book);
    }
  }
}
