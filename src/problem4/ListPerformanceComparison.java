package problem4;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class ListPerformanceComparison {

  private static final int SIZE = 100_000; // total elements
  private static final int OPERATIONS = 10_000; // random operations to test

  public static void main(String[] args) {

    List<Integer> arrayList = new ArrayList<>();
    List<Integer> linkedList = new LinkedList<>();

    System.out.println("---- Performance Comparison ----");

    System.out.println("---- Populate both lists ----");
    for (int i = 0; i < SIZE; i++) {
      arrayList.add(i);
      linkedList.add(i);
    }

    // Random insertions and deletions
    testRandomInsertDelete(arrayList, "ArrayList");
    testRandomInsertDelete(linkedList, "LinkedList");

    // Sequential insertions/deletions at beginning and end
    testSequentialInsertDelete(arrayList, "ArrayList");
    testSequentialInsertDelete(linkedList, "LinkedList");

    // Random access test
    testRandomAccess(arrayList, "ArrayList");
    testRandomAccess(linkedList, "LinkedList");
  }

  // ------------------------------------------------------------

  private static void testRandomInsertDelete(List<Integer> list, String name) {
    Random random = new Random();
    long start = System.nanoTime();

    // insert your code here
    list.set(random.nextInt(list.size()), -1);

    long end = System.nanoTime();
    System.out.printf("%s - Random insert/delete: %.3f ms%n", name, (end - start) / 1_000_000.0);
  }

  // ------------------------------------------------------------

  private static void testSequentialInsertDelete(List<Integer> list, String name) {
    long start = System.nanoTime();

    // Insertions at beginning and end

    // add your code here
    list.add(-1);
    list.set(0, -1);

    // Deletions at beginning and end

    // add your code here
    list.remove(list.size() - 1);
    list.remove(0);

    long end = System.nanoTime();
    System.out.printf(
        "%s - Sequential insert/delete (start/end): %.3f ms%n", name, (end - start) / 1_000_000.0);
  }

  // ------------------------------------------------------------

  private static void testRandomAccess(List<Integer> list, String name) {
    Random random = new Random();
    long start = System.nanoTime();

    long sum = 0;
    // sum of the all elements in the list
    // insert your code here
    for (Integer i : list) {
      sum += i;
    }

    long end = System.nanoTime();
    System.out.printf("%s - Random access (get): %.3f ms%n", name, (end - start) / 1_000_000.0);
  }
}
