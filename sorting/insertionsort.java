package sorting;
import java.util.Arrays;
//1st ele is always sorted, compare next ele with prev ones and place accordingly
public class insertionsort {
    public static void main(String[] args) {
        int arr[]={4,5,3,1,2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int arr[])
    {
        //creating outer loop for every pass
        for (int i = 0; i < arr.length-1; i++) // i<arr.length-1 i.e if n=4, no. of passes = n-1 or length-1 
        {
            //inner loop for index of ele being compared with prev ele
            for (int j = i+1; j>0; j--) //if i=0 i.e pass1, j should be at index 1 to compare w index 0 so j=i+1
                                        //if j is at index 0 no further comparisons, so j>0 always
                                        //j keeps comparing with all prev ele, so j--
            {
                if(arr[j]<arr[j-1])
                {
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    static void swap(int arr[], int a, int b){
        int temp= arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
