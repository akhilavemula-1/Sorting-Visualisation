package SortingVisualizer;

import java.util.Scanner;

public class samplesorting {

    // Bubble Sort - DSA
    static void bubbleSort(int[] arr) {

        int n = arr.length;

        System.out.println("\nSorting Process:");

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                // Display array before comparison
                display(arr);

                // Compare two elements
                if (arr[j] > arr[j + 1]) {

                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    System.out.println("Swap: " + arr[j] + " and " + arr[j + 1]);
                }
            }
        }

        System.out.println("\nFinal Sorted Array:");
        display(arr);
    }

    // Display array
    static void display(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== SORTING VISUALIZATION =====");

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nOriginal Array:");
        display(arr);

        bubbleSort(arr);

        sc.close();
    }
}

}
