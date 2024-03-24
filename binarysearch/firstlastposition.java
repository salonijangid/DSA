package binarysearch;

import java.util.Arrays;

public class firstlastposition {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,4,4,5,6};
        int target=4;
        int[] result=searchrange(nums,target);
        System.out.println(Arrays.toString(result));
    }

    static int[] searchrange(int[] nums, int target) {

        int[] ans = {-1, -1};
        // check for first occurrence if target first
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    // this function just returns the index value of target
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
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}