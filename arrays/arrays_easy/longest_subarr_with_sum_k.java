package arrays_easy;

public class longest_subarr_with_sum_k{
    public static void main(String[] args) {
        int[] a = {-59 ,-25, 58, -59, -25, 58};
        int k = -85;
        System.out.println(length(a, k));
    }

    static int length(int[] a, int k) {
        int n = a.length;
        int l = 0;
        int r = 0;
        long sum = 0;
        int len = 0;
        while (r < n) {
            sum = sum + a[r];
            while (sum > k) {
                sum = sum - a[l];
                l++;
            }
            if (sum == k) {
                len = Math.max(len, r - l + 1);
            }
            r++;
        }
        return len;
    }
}