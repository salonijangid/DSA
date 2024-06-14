package arrays_easy;

public class max_cons_ones {
    public static void main(String[] args) {
        int[] arr={1,1,1,0,1,0,1,1,1,1};
        System.out.println(max(arr));
    }

    //TC = O(N) ; SC = O(1)
    static int max(int[] arr){
        int curr_count=0;
        int max_count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==1){
                curr_count++;
                max_count=Math.max(curr_count,max_count);
            }
            else{
                curr_count=0;
            }
        }
        return max_count;
    }
}