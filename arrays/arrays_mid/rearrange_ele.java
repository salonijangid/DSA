package arrays_mid;
import java.util.ArrayList;

public class rearrange_ele {
    public static void main(String[] args) {
        int n = 4;
        int[] a= {1,2,-4,-5};
        int[]ans= rearrange(a,n);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i]+" ");
        }
    }
        
    // TC -> O(N + N/2) ; SC -> O(N)
    static int[] rearrange(int[] a, int n){
        ArrayList <Integer> positive = new ArrayList <> ();
        ArrayList <Integer> negative = new ArrayList <> ();

        for(int i=0; i<n; i++){
            if(a[i]>0){
                positive.add(a[i]);
            }
            else{
                negative.add(a[i]);
            }
        }
        for(int i=0; i<n/2; i++){
            a[2*i] = positive.get(i);
            a[2*i+1] = negative.get(i);
        }

        return a;
    }
}
