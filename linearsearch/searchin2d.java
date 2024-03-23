package linearsearch;

import java.util.Arrays;

public class searchin2d {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3,4},
            {9,8,6},
            {2,4,6,7,8,9}
        };
        int data=2;
        int[] ans=search(arr, data);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int data){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==data){
                    return new int[] {row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
