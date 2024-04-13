package recursion.arrays;

public class sorted{
    public static void main(String[] args) {
        //check if given array is sorted or not
        int[] arr = {1,4,6,8,40,12,34};
        System.out.println(check(arr, 0));
    }

    static boolean check(int[] arr, int i){
        if(i == arr.length-1){      //if only 1 ele
            return true;
        }
        return arr[i] < arr[i+1] && check(arr, i+1);
    }
}