package binarysearch;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr={2,14,23,45,67,88};   //sorted only
        int data=23;
        int ans=search(arr, data);
        System.out.println(ans);
    }
//time complexity - O(log(n))
    static int search(int[] arr, int data){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(data==arr[mid]){              //if data is the middle ele
                return mid;
            }
            else if(data<arr[mid]){         //if data is lesser than mid, end pointer will be pointed right before mid
                end=mid-1;
            }
            else{                          //if data is greater than mid, start pointer will be pointed right after mid
                start=mid+1;
            }
        }
        return -1;        //if start>end
    }
}
