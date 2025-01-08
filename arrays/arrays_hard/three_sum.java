import java.util.Arrays;

public class three_sum {
    public static void main(String[] args) {
        int[] arr = {1,0,2,-2};
        System.out.println(Arrays.toString(brute_sum(arr)));
        System.out.println(Arrays.toString(optimal_sum(arr)));
    }

    static int[] brute_sum(int[] arr){
        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length; j++){
                for(int k=j+1; k<arr.length; k++){
                    if(i!=j && i!=k && j!=k && arr[i]+arr[j]+arr[k]==0){
                        return new int[] {arr[i], arr[j], arr[k]};
                    }
                }
            }
        }
        return new int[] {0,0,0};
    }

    static int[] optimal_sum(int[] arr){
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0; i<n; i++){
            int s=i+1;
            int e=n-1;

            int sum=arr[i]+arr[s]+arr[e];

            if(sum==0){
                return new int[] {arr[i],arr[s],arr[e]};
            }
            else if(sum<0){
                s++;
            }
            else{
                e--;
            }
        }
        return new int[] {0,0,0};
    }
}
