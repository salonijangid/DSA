package sorting;

import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int low, int high){
        //low & high are pointers at arr[0] & arr[n-1]
        //s & e are pointers that compare & swap
        if(low>=high){
            return;
        }

        int s = low;
        int e = high;
        int m = s+(e-s)/2;
        int pivot = arr[m];

        while(s <= e){
            //sorted alr so no swap
            while(arr[s] < pivot){
                s++;
            }

            while(arr[e] > pivot){
                e--;
            }

            //if it violates the condition i.e arr[s] > arr[e], then swap
            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                //after swap, move to compare next ele
                s++;
                e--;
            }
        }

        //sort the halves on boht sides of pivot
        sort(arr, low, e);
        sort(arr, s, high);
    }
}
