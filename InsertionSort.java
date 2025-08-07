package Sorting_Algorithms.Basic_Sorting_Algorithms;

public class InsertionSort {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={2,4,3,4,5,6,7,1};
        int n= arr.length;
        print(arr);
//        for (int i = 1; i <n; i++) {
//            int p =i;
//            for (int j = i-1; j >=0; j--) {
//                if(arr[p]<arr[j]){
//                    int temp =arr[p];
//                    arr[p]=arr[j];
//                    arr[j]=temp;
//                    p--;
//                }
//                else{
//                    break;
//                }
//            }
//        }
        //Insertion Sort
//        for (int i = 1; i <n ; i++) {
//            for (int j = i; j >=1 ; j--) {
//                if(arr[j]<arr[j-1]){
//                    int temp =arr[j];
//                    arr[j]=arr[j-1];
//                    arr[j-1]=temp;
//                }
//                else break;
//            }
//        }
//
//        for (int i = 1; i <n ; i++) {
//            int j=i;
//            while(j>=1 && arr[j]<arr[j-1]){
//                int temp =arr[j];
//                arr[j]=arr[j-1];
//                arr[j-1]=temp;
//                j--;
//            }
//        }
        //Insertion Sort
        for (int i = 1; i <n ; i++) {
            int p=i;
            int j=i-1;
            while(j>=0 && arr[p]<arr[j]){
                int temp =arr[p];
                arr[p]=arr[j];
                arr[j]=temp;
                j--;
                p--;
            }
        }
        print(arr);
    }
}
