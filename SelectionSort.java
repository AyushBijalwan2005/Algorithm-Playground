package Sorting_Algorithms.Basic_Sorting_Algorithms;

public class SelectionSort {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr= {1,8,2,1,4,5,2,3};
        int n= arr.length;
        for (int i = 0; i <n-1 ; i++) {
            int min = arr[i];
            int k = i;
            for (int j = i + 1; j < n; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    k = j;
                }
            }
            if (k != i) {
                int temp = arr[i];
                arr[i] = min;
                arr[k] = temp;
            }
        }
        print(arr);
    }
}
