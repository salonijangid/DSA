//by implementating
//https://leetcode.com/problems/find-in-mountain-array/
public class searchinmoutain {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,1};
        int data=3;
        int ans=searchindex(arr, data);
        System.out.println(ans);
    }
    //to find the target ele with least index
    static int searchindex(int[] arr, int data){
        int peakele=peakIndexInMountainArray(arr);
        int first=search(arr, data,0,peakele);        //searching in ascending part of the arr
        while(first!=-1){
            return first;
        }
        return search(arr, data, peakele+1, arr.length-1);    //search in descending part
    }

    //https://leetcode.com/problems/find-peak-element/
    //to find the peak ele and its index
    static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=(start+end)/2;
            if(arr[mid]>arr[mid+1]){     //descending part of the array
                end=mid;   //might be the ans but check before it
            }
            else{         
                start=mid+1;            //ascending part of the array
            }
        }
        return start;   //or return end cause start==end
    }

    //order agnostic search
    static int search(int[] arr, int data, int start, int end){
        
        boolean isAscending = arr[start] < arr[end];      //compare first & last ele and decide if its ascending or not
    
        while(start<=end){
            int mid=(start+end)/2;
            if(data==arr[mid]){                           //same mid ele for both
                return mid;
            }
            if(isAscending){                              //if array is ascending order sorted
                if(data<arr[mid]){  
                    end=mid-1;      
                }
                else{             
                    start=mid+1;            
                }
            }
            else{                                         //if array is descending order sorted
                if(data>arr[mid]){  
                    end=mid-1;      
                }
                else{             
                    start=mid+1;            
                }
            }
            
        }
        return -1;        
    }
}
