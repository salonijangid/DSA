package binarysearch;
//smallest ele that is larger than or equal to the data
public class ceiling {
    public static void main(String[] args) {
        int[] arr={12,23,45,68,79,80};
        int data=67;
        int ans=ceil(arr,data);
        System.out.println(ans);
    }
    static int ceil(int[] arr, int data){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(data==arr[mid]){              
                return mid;
            }
            else if(data<arr[mid]){         
                end=mid-1;
            }
            else{                          
                start=mid+1;
            }
        }
        return arr[start];   
    }
}
