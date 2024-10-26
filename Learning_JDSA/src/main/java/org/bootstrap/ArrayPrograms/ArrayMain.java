import java.util.Scanner;

class ArrayOperation {
    int n;
    int[] arr;

    ArrayOperation(int n) {
        this.n = n;
        arr = new int[n]; // Initialize the array here
    }

    public void insertArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Insert elements into the array
        }
    }

    public void displayArray() {
        System.out.println("Array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); // Display each element
        }
        System.out.println();
    }
}

public class ArrayMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        ArrayOperation ao = new ArrayOperation(n);
        ao.insertArray();
        ao.displayArray();
    }
}
