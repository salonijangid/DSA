package sorting;

import java.util.Arrays;

//no creating new array
//just sort it in place using indices i.e start, mid, end
public class mergesortInplace {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
        }

    static void mergeSortInPlace(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }

        int mid = (s + e) / 2;

        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] merged = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            
            if (arr[i] < arr[j]) {
                merged[k] = arr[i];
                i++;
            } else {
                merged[k] = arr[j];
                j++;
            }
            k++;
        }

    
        
        while (i < m) {
            merged[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            merged[k] = arr[j];
            j++;
            k++;
        }

        //copying to given array
        for (int l = 0; l < merged.length; l++) {
            arr[s+l] = merged[l];
          
        }
    }

}

