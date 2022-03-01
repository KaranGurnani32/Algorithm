package heap;

import java.util.Scanner;

public class HeapRunner {
    public static final Scanner scanner = new Scanner(System.in);
    public static Heap heap = new Heap();

    public static void main(String[] args) {
        int choice;
        do {
            menu();
            System.out.println("Enter you choice");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    insert();
                    break;
                case 2:
                    remove();
                    break;
                case 3:
                    removeByIndex();
                    break;
                case 4:
                    heap.print();
                    break;
                default:
                    System.out.println("invalid choice.");
            }
        } while (choice != 5);
        System.out.println("Quitting");
    }

    private static void removeByIndex() {
        System.out.println("Enter index : ");
        int index = scanner.nextInt();
        int element = heap.removeByIndex(index);
        if (element != -404) {
            System.out.println("element deleted from heap is " + element);
        }
    }

    private static void remove() {
        int max = heap.remove();
        if (max != -404) {
            System.out.println("max element deleted from heap is " + max);
        }
    }

    private static void insert() {
        System.out.println("Enter data = ");
        int input = scanner.nextInt();
        heap.insert(input);
    }

    private static void menu() {
        System.out.println("1. insert");
        System.out.println("2. remove top");
        System.out.println("3. remove by index");
        System.out.println("4. print");
        System.out.println("5. quit");
    }
}
