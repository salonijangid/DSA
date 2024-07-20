import java.util.ArrayList;
import java.util.List;
public class majority_ele{
    public static void main(String[] args) {
        int[] arr={1,2,2,2,3,3,3,3};
        List<Integer> result = brute_ele(arr);
        System.out.println(result);
    }

    static List<Integer> brute_ele(int[] arr){
        int n = arr.length;
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[j] == arr[i]){
                    count++;
                }
            }
            if(count > (n/3)){
                if(!ans.contains(arr[i])){
                    ans.add(arr[i]);
                }
            }
        }
        return ans;
    }
}