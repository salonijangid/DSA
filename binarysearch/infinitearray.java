package binarysearch;
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class infinitearray {
    public static void main(String[] args) {
        int[] arr={12,23,24,34,35,46,67,89};
        int data=46;
        int ans = range(arr, data);
        System.out.println(ans);
    }
    
    static int range(int[] arr, int data){
        int start=0;      //searching the data in small chunks and doubling the size until we find it
        int end=1;

        while(data>arr[end]){
            int newstart= end+1;
            end=end+(end-start+1)*2;     //new end = prev end + size of range prev searched * 2 ; size = end-start+1
            start=newstart;              //updating after end cause old start is used
        }
        return search(arr, data, start, end);
    }
    static int search(int[] arr, int data, int start, int end){
       
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
        return -1;        
    }
}
