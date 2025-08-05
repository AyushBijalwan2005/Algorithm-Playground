package Sorting_Algorithms.Basic_Sorting_Algorithms;


public class BubbleSort {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={3,1,2,5,4};
        print(arr);
        int n= arr.length;
        //Bubble Sort Varient 1
//        for (int k = 0; k <n-1 ; k++) {
//            for (int i = 0; i < n-1; i++) {
//                if(arr[i]>arr[i+1]){
//                    int temp=arr[i];
//                    arr[i]=arr[i+1];
//                    arr[i+1]=temp;
//                }
//            }
//        }

        //Bubble Sort Vareint 2
//        for (int k = 0; k <n-1 ; k++) {
//            for (int i = 0; i < n-1-k; i++) {
//                if(arr[i]>arr[i+1]){
//                    int temp=arr[i];
//                    arr[i]=arr[i+1];
//                    arr[i+1]=temp;
//                }
//            }
//        }

        //Bubble Sort Optimized
//        for (int k = 0; k <n-1 ; k++) {
//            boolean flag=true;
//            for (int i = 0; i < n-1-k; i++) {
//                if(arr[i]>arr[i+1]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }
//            for (int i = 0; i <n-1 ; i++) {
//                if(arr[i]>arr[i+1]){
//                    flag=false;
//                    break;
//                }
//            }
//            if(flag) break;
//        }

        //Bubble Sort Optimized -2
        for (int k = 0; k <n-1 ; k++) {
            boolean flag=true;
            for (int i = 0; i < n-1-k; i++) {
                if(arr[i]>arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag=false;
                }
            }
            if(flag) break;
        }
        print(arr);
    }
}
