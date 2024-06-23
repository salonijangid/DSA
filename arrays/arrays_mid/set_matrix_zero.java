package arrays_mid;
import java.util.Arrays;

public class set_matrix_zero {
    public static void main(String[] args) {
        int[][] a= {{1,1,1},{1,0,1},{1,1,1}};
        //System.out.println(Arrays.deepToString(set_brute(a, 3,3)));
        System.out.println(Arrays.deepToString(set_optimal(a, 3,3)));
    }


    //brute force -> O(n^3)

    static int[][] set_brute(int[][] a, int n, int m){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(a[i][j] == 0){
                    set_row(a, i, n);
                    set_col(a, j, m);
                }
            }
        }
        change(a, n, m);
        return a;
    }
    static void set_row(int[][] a, int i, int n){
        for(int j=0; j<n; j++){
            if(a[i][j] != 0) a[i][j] = -1;
        }
    }
    static void set_col(int[][] a, int j, int m){
        for(int i=0; i<m; i++){
            if(a[i][j] != 0) a[i][j] = -1;
        }
    }
    static void change(int[][] a, int n, int m){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(a[i][j] == -1){
                    a[i][j] = 0;
                }
            }
        }
    }


    //optimal -> O(n^2)
    
    static int[][] set_optimal(int[][] a, int n, int m){
        //int col0 = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(a[i][j] == 0){
                    a[i][0] = 0;
                    if(j!=0){
                        a[0][j] = 0;
                    }
                    else{
                        //col0 = 0;
                    }
                }
            }
        }
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(a[i][j] != 0){
                    if(a[i][0] == 0 || a[0][j] == 0){
                        a[i][j] = 0;
                    }
                }
            }
        }
        return a;
    }

}
