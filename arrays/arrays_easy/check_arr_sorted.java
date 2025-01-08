package arrays_easy;

public class check_arr_sorted {
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
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



//sort rotated?   e.g.- [3,4,5,1,2]-> true ; [2,1,3,4]-> false
/*
    public boolean check(int[] nums) {
    int count = 0;
    for(int i = 0;i < nums.length; i++){
        if(nums[i] > nums[(i+1) % nums.length]){
            count ++;    //counting the no. of inversions being made i.e. in [3,4,5,1,2] there's only one inversion (5>1) so it can be a rotated arr
        }
        if(count > 1){
            return false;
        }
    }
    return true;
    }
 */