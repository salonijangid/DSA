package arrays_mid;
import java.util.Arrays;

public class next_permutation {
    public static void main(String[] args) {
        int[] a = {2,1,5,4,3,0,0};
        int n=7;
        System.out.println(Arrays.toString(next(a, n)));
    }

    static int[] next(int[] a, int n){
        int index = -1;
        for(int i=n-2; i>=0; i--){
            if(a[i] < a[i+1]){
                index=i;
                break;
            }
        }
        for(int i=n-1; i>index; i--){
            if(a[i] > a[index]){
                swap(a,index,i);
                break;
            }
        }

        if(index == -1){
            reverse(a,0,n);
        }
        else{
            reverse(a, index+1, n-1);
        }

        return a;
    }

    static void reverse(int[] a, int s, int e){
        while(s<=e){
        int temp=a[s];
        a[s]=a[e];
        a[e]=temp;
        s++;
        e--;
        }
    }

    static void swap(int[] a, int b, int c){
        int temp=a[b];
        a[b]=a[c];
        a[c]=temp;
    }
}
