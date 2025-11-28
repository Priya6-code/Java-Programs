package javafundamentals;

import java.util.Scanner;

public class ArrayManipulation {

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Linear Search
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1; // Not found
    }

    // Display Array
    public static void displayArray(int[] arr) {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

    // Main Method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size and elements
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++)
            array[i] = scanner.nextInt();

        // Sort the array
        bubbleSort(array);
        System.out.println("Sorted array:");
        displayArray(array);

        // Search for an element
        System.out.print("Enter the element to search: ");
        int key = scanner.nextInt();
        int result = linearSearch(array, key);

        if (result == -1)
            System.out.println("Element not found.");
        else
            System.out.println("Element found at index: " + result);

        scanner.close();
    }
}

