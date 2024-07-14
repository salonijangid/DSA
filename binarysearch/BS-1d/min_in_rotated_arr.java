public class min_in_rotated_arr {
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        System.out.println(search(arr));
    }

    //TC -> O(log N) ; SC -> O(1)
    static int search(int[] arr){
        int n=arr.length;
        int s = 0;
        int e = n-1;
        int ans = Integer.MAX_VALUE;
        while(s<=e){
            int m = (s+e)/2;
            if(arr[s] <= arr[m]){
                ans = Math.min(ans, arr[s]);
                s=m+1;
            }
            else{
                ans = Math.min(ans, arr[m]);
                e=m-1;
            }
        }
        return ans;
    }
}
