/* The upper bound algorithm finds the first or the smallest index in a sorted array
 where the value at that index is greater than the given key i.e. x */
 public class upper_bound {
    public static void main(String[] args) {
        int[] a = {3, 5, 8, 9, 15, 19};
        int n = 6, x = 9;
        System.out.println(bound(a, n, x));
    }

    //TC -> O(LOG N) ; SC -> O(1)
    static int bound(int[] a, int n, int x){
        int s = 0;
        int e = n - 1;
        int ans = n;  
        while(s<=e){
            int m = (s+e)/2;
            if(a[m]>x){
                ans = m;
                e = m - 1;
            }
            else{
                s = m + 1;
            }
        }
        return ans;
    }    
}
