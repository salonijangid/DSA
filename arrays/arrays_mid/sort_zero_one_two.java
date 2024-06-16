package arrays_mid;
import java.util.Arrays;

public class sort_zero_one_two {
    public static void main(String[] args) {
        int[] a = {1,1,0,2,0,0,2,2,1};
        System.out.println(Arrays.toString(sorting(a)));
    }

    static int[] sorting(int[] a){
        int n = a.length;
        int l = 0;
        int m = 0;
        int h = n - 1;
        while(m <= h){
            if(a[m] == 0){
                swap(a, m, l);
                l++;
                m++;
            }
            else if(a[m] == 1){
                m++;
            }
            else{
                swap(a, m, h);
                h--;
            }
        }
        return a;
    }

    static void swap(int[] a, int b, int c){
        int temp = a[b];
        a[b] = a[c];
        a[c] = temp;
    }
}