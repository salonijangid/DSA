package arrays_mid;
import java.util.Arrays;

public class rotate_matrix_by_90 {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        //System.out.println(Arrays.deepToString(rotate_brute(a)));
        System.out.println(Arrays.deepToString(rotate_optimal(a)));
    }

    //TC & SC -> O(n*n)
    static int[][] rotate_brute(int[][] a){
        int n = a.length;
        int[][] rotated = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                rotated[j][n-i-1] = a[i][j];
            }
        }
        return rotated;
    }

    //TC = O(n*n) ; SC = O(1)
    static int[][] rotate_optimal(int[][] a){
        int n = a.length;
        for(int i=0; i<n; i++){
            for(int j=i; j<a[i].length; j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<a.length/2; j++){
                int temp = a[i][j];
                a[i][j] = a[i][n-j-1];
                a[i][n-j-1] = temp;
            }
        }
        return a;
    }
}