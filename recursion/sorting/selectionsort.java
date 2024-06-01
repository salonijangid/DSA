package recursion.sorting;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr= {4,5,2,1,3};
        sort(arr, arr.length, 0, 0);;
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr,int r, int c, int max){
        if(r == 0){
            return;
        }
        if(c<r){
            //assume 1st ele of current row is max
            if(arr[c] > arr[max]){
                sort(arr, r, c+1, c);      //max will updated to the col u are in now
            }
            else{
                sort(arr, r, c+1, max);
            }
        }
        else{
            //swap the max with last ele in the row i.e row-1
            int temp=arr[max];
            arr[max]=arr[r-1];
            arr[r-1]=temp;
            //for next row
            sort(arr, r-1, 0, 0);
        }
    }
}
