import java.util.Arrays;

public class three_sum {
    public static void main(String[] args) {
        int[] arr = {1,0,2,-2};
        System.out.println(Arrays.toString(sum(arr)));
    }

    static int[] sum(int[] arr){
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
}
