package arrays_mid;
import java.util.ArrayList;
import java.util.Collections;
// last ele is always a leader; all ele in the arr must be > the right ele to it
public class leaders_in_arr {
    public static void main(String[] args) {
        int[] a = {10, 22, 12, 3, 0, 6};
        ArrayList<Integer> ans = greater_than_right(a);
        Collections.sort(ans, Collections.reverseOrder());
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
          }
    }

    //TC -> O(N) ; SC -> O(1)
    static ArrayList<Integer> greater_than_right(int[] a){
        ArrayList<Integer> ans = new ArrayList<>();
        int n = a.length;
        int max = a[n-1];
        ans.add(a[n-1]);
        for(int i=n-2; i>=0; i--){
            if(a[i] > max){
                ans.add(a[i]);
                max = a[i];
            }
        }
        return ans;
    }
}
