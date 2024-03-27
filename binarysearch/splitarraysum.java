package binarysearch;

public class splitarraysum {
    public static void main(String[] args) {
        int[] nums={7,2,5,10,8};
        int m=2;
        System.out.println(splitArray(nums, m));
    }

    static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); // start will have the max item of the array
            end = end + nums[i];
        }

        // binary search
        while (start < end) {
            // try for the middle as potential ans
            int mid = (start + end) / 2;

            int sum = 0;
            int pieces = 1; //min. no. of subarray
            for(int num : nums) {
                if (sum + num > mid) {
                    // u cannot add this in this subarray, make new one
                    // if u can add this num in new subarray, then sum = num
                    sum = num;
                    pieces++;
                } else {
                    sum = sum + num;
                }
            }

            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }

        }
        return end; // here start == end
    }
}
