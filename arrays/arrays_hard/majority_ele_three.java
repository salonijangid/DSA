import java.util.ArrayList;
import java.util.List;
public class majority_ele_three{
    public static void main(String[] args) {
        int[] arr={1,2,2,2,3,3,3,3};
        List<Integer> result = brute_ele(arr);
        List<Integer> result2 = optimal_ele(arr);
        System.out.println(result);
        System.out.println(result2);
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

    static List<Integer> optimal_ele(int[] arr){
        int ele=0;
        int count=0;
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(count==0){
                count=1;
                ele=arr[i];
            }
            else if(arr[i]==ele){
                count++;
            }
            else{
                count--;
            }
        int c=0;
        for(int j=0; j<arr.length;j++){
            if(arr[j]==ele){
                c++;
            }
        }
        if(c>arr.length/3){
            if(!ans.contains(arr[i])){
                ans.add(arr[i]);
            }
        }
    }
        return ans;
    }
}