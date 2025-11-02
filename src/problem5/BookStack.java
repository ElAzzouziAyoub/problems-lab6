package problem5;

import java.util.LinkedList;

public class BookStack {
  private LinkedList<Book> stack;

  public BookStack() {
    this.stack = new LinkedList<Book>();
  }

  public void push(Book book) {
    this.stack.addFirst(book);
  }

  public Book pop() {
    if (!this.isEmpty()) {
      Book book = this.stack.getFirst();
      this.stack.removeFirst();
      return book;
    }
    return null;
  }

  public Book peek() {
    if (!this.isEmpty()) {
      return this.stack.getFirst();
    }
    return null;
  }

  public boolean isEmpty() {
    return this.stack.isEmpty();
  }

  public void display() {
    System.out.println("Stack contents (top to bottom):");
    for (Book book : this.stack) {
      System.out.println(book);
    }
  }
}
