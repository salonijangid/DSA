package arrays_mid;

public class print_max_sum_subarr {
    public static void main(String[] args) {
        int[] a ={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(sum(a));
    }

    static int sum(int[] a){
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0;
        int ans_start=-1;
        int ans_end=-1;
        for(int i=0; i<a.length; i++){
            if(sum==0) start=i;

            sum = sum + a[i];

            if(sum > maxsum){
                maxsum = sum;

                ans_start=start;
                ans_end=i;
            }

            if(sum < 0){
                sum = 0;
            }
        }
        System.out.println("Maximum subarray sum: " + maxsum);
        System.out.println("Subarray: ");
        for(int i=ans_start; i<= ans_end; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        return maxsum;
    }
}
