import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of elements
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();

        // Add elements to the LinkedList
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // Obtain the ListIterator
        ListIterator<Integer> it = list.listIterator();

        // 1. Forward Traversal
        System.out.print("Forward: ");
        while (it.hasNext()) {
            System.out.print(it.next() + (it.hasNext() ? " " : ""));
        }
        System.out.println();

        // 2. Backward Traversal
        // Note: After the forward loop, the cursor 'it' is at the end of the list.
        System.out.print("Backward: ");
        while (it.hasPrevious()) {
            System.out.print(it.previous() + (it.hasPrevious() ? " " : ""));
        }
        System.out.println();

        sc.close();
    }
}