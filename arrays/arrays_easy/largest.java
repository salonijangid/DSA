package arrays_easy;

import java.util.Arrays;

public class largest {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 4};
        System.out.println(find(arr)); 
        System.out.println(find2(arr)); 
    }

    //brute force -  TC = O(N* log(N)) ; SC = O(N)
    static int find(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    //optimal - TC = O(N) ; SC = O(1)
    static int find2(int[] arr) {
        int max=arr[0];
        for(int i=1; i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
