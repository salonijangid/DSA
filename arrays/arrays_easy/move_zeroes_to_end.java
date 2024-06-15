package arrays_easy;

import java.util.Arrays;

public class move_zeroes_to_end {
    public static void main(String[] args) {
        int[] arr = {1,3,0,4,0,0,7,6,0};
        System.out.println(Arrays.toString(move(arr)));
    }

    static int[] move(int[] arr){
        int j = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j == -1){
            return arr;
        }
        for(int i=j+1; i<arr.length; i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }
}
