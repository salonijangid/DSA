package linearsearch;
//https://leetcode.com/problems/richest-customer-wealth/description/
public class maxwealth {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
            {4,5,6},           //find the max sum among all rows
            {2,3,6}
        };
        int result=max(arr);
        System.out.println(result);
    }

    static int max(int[][] arr){
        int ans=0;
        for(int row=0;row<arr.length;row++){
            int sum=0;
            for(int col=0;col<arr[row].length;col++){
                sum = sum + arr[row][col];      //for every row, adds all col ele of that row one by one and updates sum, repeates for all the rows
            }
            if(sum>ans){         //to get the max of all the row sums
                ans=sum;
            }
        }


        return ans;
    }
}
