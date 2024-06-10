package arrays_easy;

public class missing_num_in_arr {
    public static void main(String[] args) {
        int[] arr={0,1,2,4};
        System.out.println(missing_num(arr));
    }

    //TC & SC = O(N)
    static int missing_num(int[] arr){
        int sum=0;
        for(int num : arr){
            sum=sum+num;
        }
        int n = arr.length;
        int total = (n*(n+1)/2);

        return total-sum;
    }
}
