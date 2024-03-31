package sorting;

import java.util.Arrays;

//split the given array into parts
//sort them sep via recursion 
//merge them
//return the merged array i.e new
public class mergesortNewarray {
    public static void main(String[] args){
        int[] arr={5,4,3,2,1};
        arr = mergesort(arr);    //updating given array
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergesort(int[] arr){
        if(arr.length == 1){
            return arr;    //if only one ele, just return it
        }
        else{
        //otherwise split the array into half
        int mid = arr.length / 2;

        //create array for 1st & 2nd sub arrays by copying from given array
        int[] left = mergesort(Arrays.copyOfRange(arr, 0 , mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));

        //return a merged array of 1st & 2nd sorted arrays
        return merge(left, right);
        }
    }

    static int[] merge(int[] first, int[] second){
        int[] merged = new int[first.length + second.length];   //length

        int i = 0;   //to compare ele from 1st array
        int j = 0;   //to compare ele from 2nd array
        int k = 0;   //to add ele in the merged array

        while(i < first.length && j < second.length){    //to check array out of bounds
            if(first[i] < second[j]){
                merged[k] = first[i];
                i++;
            }
            else{
                merged[k] = second[j];
                j++;
            }
            k++;
        }

        //if both the subarrays are not of equal length
        //copy the ele of the larger subarray as it is

        while(i < first.length){
            merged[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length){
            merged[k] = second[j];
            j++;
            k++;
        }

        return merged;
    }
    
}
