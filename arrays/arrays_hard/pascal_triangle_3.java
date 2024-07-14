import java.util.ArrayList;
import java.util.List;
public class pascal_triangle_3 {
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> triangle = triangle(n);
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }

    static List<Integer> print_row(int n){  //row
        long ans = 1;
        List<Integer> generate_row = new ArrayList<>();
        generate_row.add(1);
        for(int i=1; i<n; i++){  //col
            ans = ans * (n-i);
            ans = ans / i;
            generate_row.add((int)ans);
        }
        return generate_row;
    }

    static List<List<Integer>> triangle(int n){
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<=n; i++){
            ans.add(print_row(i+1));
        }
        return ans;
    }
}
