package arrays_easy;
public class sec_large_small {
    public static void main(String[] args) {
        int[] arr={3,2,1,5,4};
        int n=5;
        System.out.println(find(arr, n));
    }   

    //TC = O(N) ; SC = O(1)
    static int find(int[] arr, int n){
        if(n==0 || n==1){
            return -1;
        }
        int small=Integer.MAX_VALUE;
        int sec_small=Integer.MAX_VALUE;
        int large=Integer.MIN_VALUE;
        int sec_large=Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            small=Math.min(small, arr[i]);
            large=Math.max(large, arr[i]);
        }

        for(int i=0; i<n; i++){
            if(arr[i]<sec_small && arr[i]!=small){
                sec_small=arr[i];
            }
            if(arr[i]>sec_large && arr[i]!=large){
                sec_large=arr[i];
            }
        }

        return sec_large;
    }
}



//or-
/*
 public int getSecondLargest(int[] arr) {
        // Code Here
        
        //without .sort

        if(arr==null || arr.length<2){
            return -1;
        }
        
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        
        for(int num : arr){
            if(num > max){
                secmax=max;
                max=num;
            }
            else if(num > secmax && num < max){
                secmax=num;
            }
        }
        return secmax == Integer.MIN_VALUE ? -1 : secmax;
    }
 */