package sorting;
import java.util.Arrays;
//find largest and swap w last pos ele //find smallest and swap w first pos ele
public class selectionsort {
    public static void main(String[] args) {
        int arr[]={2,4,1,3,5};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int arr[])
    {
        //find the max ele and put in last position or correct index
        for (int i = 0; i < arr.length; i++) {
            int last= arr.length-i-1; //last pos
            int max= getMaxIndex(arr, 0, last); //finding max ele to swap to last pos
            swap(arr, max, last);
        }
    }

    static int getMaxIndex(int arr[], int start, int end)
    {
        int max= start; //assuming first ele is max and comparing w every ele till end to get max
        for (int i = start; i <=end; i++) {
            if(arr[max]<arr[i])   //1st ele < every next i ele
            {
                max=i;   //that i ele will be max
            }
        }
        return max;    
    }

    static void swap(int arr[], int a, int b)  //a=max & b=last while calling this method
    {
        int temp= arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
