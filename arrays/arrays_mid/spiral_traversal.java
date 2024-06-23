package arrays_mid;
import java.util.ArrayList;
import java.util.List;

public class spiral_traversal {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}};
        
        List<Integer> ans = print(a,4,4);

        for(int i = 0;i<ans.size();i++){
            System.out.print(ans.get(i) + " ");
        }

        System.out.println();
    }

    static List<Integer> print(int[][] a, int n, int m){
        List<Integer> ans = new ArrayList<>();
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = m-1;
    
        while(top <= bottom && left <= right){
            // Traverse right
            for(int i = left; i <= right; i++){
                ans.add(a[top][i]);
            }
            // Traverse down
            for(int i = top+1; i <= bottom; i++){
                ans.add(a[i][right]);
            }
            // Traverse left
            if(top < bottom){
                for(int i = right-1; i >= left; i--){
                    ans.add(a[bottom][i]);
                }
            }
            // Traverse up
            if(left < right){
                for(int i = bottom-1; i > top; i--){
                    ans.add(a[i][left]);
                }
            }
            top++;
            bottom--;
            left++;
            right--;
        }
        
        return ans;
    }
    
}

