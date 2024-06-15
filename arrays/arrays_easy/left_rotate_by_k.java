package arrays_easy;
import java.util.Arrays;
public class left_rotate_by_k {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int n=7; int k=2;
        System.out.println(Arrays.toString(rotate(arr, n, k)));  
    }
    
    static void swap(int[] arr, int s, int e){
        while(s<=e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
    static int[] rotate(int[] arr, int n, int k){
        swap(arr, 0, k-1);
        swap(arr, k, n-1);
        swap(arr, 0, n-1);
        return arr;
    }
}
