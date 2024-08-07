import java.util.Arrays;

public class first_last_occurence_of_ele {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,4,4,5,6};
        int target=4;
        int[] result=searchrange(nums,target);
        System.out.println(Arrays.toString(result));
    }

    static int[] searchrange(int[] nums, int target) {

        int[] ans = {-1, -1};
        // checking first occurrence
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    //returns the index of target
    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
        
            int mid = (start+end) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                //can have same ele before or after the potential ans also
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;         //to check if same ele exists before it
                } else {
                    start = mid + 1;       //after it
                }
            }
        }
        return ans;
    }
}