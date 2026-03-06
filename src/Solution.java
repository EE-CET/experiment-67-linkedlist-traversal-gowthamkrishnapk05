import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read N (the number of elements)
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();

        // Add N integers to the list
        for (int i = 0; i < n; i++) {
            if (sc.hasNextInt()) {
                list.add(sc.nextInt());
            }
        }

        // Initialize the ListIterator
        ListIterator<Integer> it = list.listIterator();

        // 1. Forward Traversal
        System.out.print("Forward: ");
        while (it.hasNext()) {
            System.out.print(it.next());
            if (it.hasNext()) {
                System.out.print(" ");
            }
        }
        System.out.println();

        // 2. Backward Traversal
        // The iterator 'it' is currently at the end of the list
        System.out.print("Backward: ");
        while (it.hasPrevious()) {
            System.out.print(it.previous());
            if (it.hasPrevious()) {
                System.out.print(" ");
            }
        }
        System.out.println();

        sc.close();
    }
}