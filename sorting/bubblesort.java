package sorting;
import java.util.Arrays;
//compares adjacent elements 
public class bubblesort{
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        //run the passes n-1 times (n=no. of elements)
        for(int i=0; i<arr.length; i++){
            //run the inner loop i.e j until max ele comes at right position
            for (int j = 1; j < arr.length-i; j++) {
                //swap if j is lesser than j-1 element
                if(arr[j]<arr[j-1]){
                    //swap the elements
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}