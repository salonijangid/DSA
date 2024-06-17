import java.util.Arrays;

public class floorandceil {
    public static void main(String[] args) {
        int[] a={1,3,5,7,8};
        int n=5;
        int x=6;
        System.out.println(Arrays.toString(find(a, n, x)));
    }

    public static int[] find(int[] a, int n, int x){
        int floor=-1;
        int ceil=-1;
        int s=0;
        int e=n-1;
        while(s<=e){
            int m=s+(e-s)/2;

            if(x == a[m]){
                floor=a[m];
                ceil=a[m];
                break;
            }
            else if(x < a[m]){
                ceil=a[m];
                e=m-1;
            }
            else{
                floor=a[m];
                s=m+1;
        }
      }
      return new int[] {floor, ceil};
    }
}
