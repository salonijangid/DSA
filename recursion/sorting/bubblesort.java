package recursion.sorting;
import java.util.Arrays;
public class bubblesort {
    public static void main(String[] args) {
        int[] arr= {4,5,2,1,3};
        int n=arr.length;
        sort(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr,int n){
        if(n==1){
            return;
        }
        for(int j=0; j<=n-2; j++){
            if(arr[j] > arr[j+1]){
                //swap
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        sort(arr, n-1);
    }
}
