public class longest_subarr_sum_zero {
    public static void main(String[] args) {
        int a[] = {6, -2, 2, -8, 1, 7, 4, -10};
        System.out.println(subarr(a));
    }

    static int subarr(int[] a){
        int max=0;
        for(int i=0; i<a.length; i++){
            int sum=0;
            for(int j=i; j<a.length; j++){
                sum=sum+a[j];

                if (sum==0){
                    max=Math.max(max, j-i+1);
                }
            }
        }
        return max;
    }
}
