//when you dont know if the sorted array is ascending or descending
public class orderagnostic {
    public static void main(String[] args) {
        int[] arr={123,67,56,45,23,12,9,2};   
        int data=23;
        int ans=search(arr, data);
        System.out.println(ans);
    }

    static int search(int[] arr, int data){
        int start=0;
        int end=arr.length-1;

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
