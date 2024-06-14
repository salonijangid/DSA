package arrays_easy;

public class check_arr_sorted {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,7,6};
        System.out.println(check(arr));
    }

    //TC = O(N) ; SC = O(1)
    static boolean check(int[] arr){
        for(int i=1; i<arr.length; i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
}