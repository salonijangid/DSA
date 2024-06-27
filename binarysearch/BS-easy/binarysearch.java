public class binarysearch {
    public static void main(String[] args) {
        int[] arr={2,14,23,45,67,88};   
        int data=23;
        int ans=search(arr, data);
        System.out.println(ans);
    }

    static int search(int[] arr, int data){
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
        return -1;        
    }
}
