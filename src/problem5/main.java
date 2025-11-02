package problem5;

public class main {
  public static void main(String[] args) {
    // Create some books
    Book book1 = new Book("1984", "George Orwell", 1985);
    Book book2 = new Book("Brave New World", "Aldous Huxley", 2005);
    Book book3 = new Book("Fahrenheit 451", "Ray Bradbury", 1941);

    // --- STACK DEMO ---
    System.out.println("=== Book Stack Demo ===");
    BookStack stack = new BookStack();
    stack.push(book1);
    stack.push(book2);
    stack.push(book3);

    stack.display();

    System.out.println("\nTop of stack: " + stack.peek());
    System.out.println("Popped: " + stack.pop());

    // --- QUEUE DEMO ---
    System.out.println("\n=== Book Queue Demo ===");
    BookQueue queue = new BookQueue();
    queue.enqueue(book1);
    queue.enqueue(book2);
    queue.enqueue(book3);

    queue.display();

    System.out.println("\nFront of queue: " + queue.peek());
    System.out.println("Dequeued: " + queue.dequeue());
  }
}
