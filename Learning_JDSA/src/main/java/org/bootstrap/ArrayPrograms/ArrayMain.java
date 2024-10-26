import java.util.Scanner;

//O(n)+O(n)+O(n)+O(n)=O(n) for Delete
class ArrayOperation {
    int n;
    int[] arr;

    ArrayOperation(int n) {
        this.n = n;
        arr = new int[n];
    }

    public void insertArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public void displayArray() {
        System.out.println("Array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); // Display each element
        }
        System.out.println();
    }

    void updateArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to update in the array:");
        int pos = sc.nextInt();
        System.out.println("Enter the  new element");
        int ele = sc.nextInt();
        pos=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==ele){
                pos=i;
                break;
            }
        }
        if(pos>-1){
            arr[pos]=ele;
            System.out.println("The element is updated"+ele);
        }else{
            System.out.println("The element not found");
        }
    }

    public void DeleteArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element to be deleted:");
        int ele = sc.nextInt();
        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == ele) {
                pos = i;
                break;
            }
        }
        if (pos > -1) {
            int res[] = new int[n-1];
            int k = 0;
            for (int i = 0; i < n - 1; i++) {
                if (i == pos) {
                    continue;
                }
                res[k] = arr[i];
                k++;
            }
            for (int i = 0; i < n - 1; i++) {
                System.out.println(res[i] + " ");
            }
        } else {
            System.out.println("Element not found:");
        }
    }



    void searchArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be searched");
        int ele = sc.nextInt();
        int pos=-1;
                for(int i=0;i<n;i++){
                    if(arr[i]==ele){
                        pos=i;
                        return;
                    }
                }
                if(pos>-1){
                    System.out.println("Element found in the position"+pos);
                }else{
                    System.out.println("element not found");
                }
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
            ao.updateArray();
            ao.searchArray();
            ao.DeleteArray();

        }
    }

