package recursion.sorting;
import java.util.Arrays;
public class insertionsort {
    public static void main(String[] args) {
        int[] arr= {4,5,2,1,3};
        int n=arr.length;
        sort(arr, 0, n);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int i, int n){
        if(i==n){
            return;
        }
        for(int j=i; j>0; j--){
            if(arr[j] < arr[j-1]){
                //swap
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
        }
        sort(arr, i+1, n);
    }
}
