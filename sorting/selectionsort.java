package sorting;
import java.util.Arrays;
public class selectionsort {
    public static void main(String[] args) {
        int arr[]={2,4,1,3,5};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            int last= arr.length-i-1; 
            int max= getMaxIndex(arr, 0, last); 
            swap(arr, max, last);
        }
    }

    static int getMaxIndex(int arr[], int start, int end)
    {
        int max= start; 
        for (int i = start; i <=end; i++) {
            if(arr[max]<arr[i])   
            {
                max=i;   
            }
        }
        return max;    
    }

    static void swap(int arr[], int a, int b)  
    {
        int temp= arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
