package arrays_mid;

public class max_subarr_sum {
    public static void main(String[] args) {
        int[] a ={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(sum(a));
    }

    static long sum(int[] a){
        long maxsum = Long.MIN_VALUE;
        long sum = 0;
        for(int i=0; i<a.length; i++){
            sum = sum + a[i];

            if(sum > maxsum){
                maxsum = sum;
            }

            if(sum < 0){
                sum = 0;
            }
        }
        return maxsum;
    }
}
