package arrays_mid;
import java.util.Arrays;

public class longest_cons_seq {
    public static void main(String[] args) {
        int[] a = {100, 200, 1, 2, 3, 4};
        System.out.println(longest_seq(a));
    }

    static int longest_seq(int[] a){
        int n = a.length;
        if(n==0) return 0;

        Arrays.sort(a);
        int small = Integer.MIN_VALUE;
        int count = 0;
        int longest = 1;

        for(int i=0; i<n; i++){
            if(a[i] - 1 == small){
                count++;
                small = a[i];
            }
            else if(a[i] != small){
                count = 1;
                small = a[i];
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
}
