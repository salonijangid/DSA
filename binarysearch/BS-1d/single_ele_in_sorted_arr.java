public class single_ele_in_sorted_arr {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,4};
        System.out.println(search(arr));
    }

    static int search(int[] arr){
        int n = arr.length;
        if(n==1){
            return arr[0];
        }
        if(arr[0]!=arr[1]){
            return arr[0];
        }
        if(arr[n-1]!=arr[n-2]){
            return arr[n-1];
        }
        int s = 1;
        int e = n-2;
        while(s<=e){
            int m = (s+e)/2;
            if(arr[m]!=arr[m-1] && arr[m]!=arr[m+1]){
                return arr[m];
            }
            if(m%2==0 && arr[m]==arr[m+1] || m%2==1 && arr[m]==arr[m-1]){
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        return -1;
    }
}
