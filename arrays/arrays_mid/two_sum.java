package arrays_mid;

import java.util.Arrays;

public class two_sum {
    public static void main(String[] args) {
        int[] arr={2,5,7,4};
        int target=9;
        System.out.println(Arrays.toString(sum(arr, target)));
    }

    static int[] sum(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
