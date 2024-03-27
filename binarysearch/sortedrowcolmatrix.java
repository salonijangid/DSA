package binarysearch;

import java.util.Arrays;

public class sortedrowcolmatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int data=2;
        System.out.println(Arrays.toString(search(matrix, data)));
    }
//by comparing and eliminating the row & col accordingly
    static int[] search(int[][] matrix, int data){
        int r= 0;  //start
        int c= matrix.length-1;   //end

        while(r< matrix[0].length && c>= 0){
            //3 cases
            if(matrix[r][c] == data){
                return new int[] {r,c};
            }
            if(matrix[r][c] < data){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[] {-1,-1};
    }
}
