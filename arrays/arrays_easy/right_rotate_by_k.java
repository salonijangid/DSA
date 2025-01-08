package arrays_easy;
import java.util.Arrays;
public class right_rotate_by_k {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int n=7; int k=2;
        rotate(arr,n,k);
        System.out.println(Arrays.toString(arr)); 
    }
    
    static void swap(int[] arr, int s, int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
    
    static void rotate(int[] arr, int n, int k){
        k = k % n;
        if (k == 0 || n == 1) return;
        swap(arr, 0, n-k-1);
        swap(arr, n-k, n-1);
        swap(arr, 0, n-1);
    }
}
