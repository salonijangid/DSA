public class peak_ele {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,5,1};
        System.out.println(brute_search(arr));
        System.out.println(optimal_search(arr));
    }

    static int brute_search(int[] arr){
        int index = -1;
        int n = arr.length;
        for(int i=0; i<n; i++)
        if((i==0 || arr[i-1]<arr[i]) && (i==n-1 || arr[i]>arr[i+1])){
            index = arr[i];
        }
        return index;
    }

    static int optimal_search(int[] arr){
        int n = arr.length;
        if(n==1){
            return arr[0];
        }
        if(arr[0] > arr[1]){
            return arr[0];
        }
        if(arr[n-1] > arr[n-2]){
            return arr[n-1];
        }
        int s = 1;
        int e = n-2;
        while(s<=e){
            int m = s + (e - s) / 2;
            if(arr[m]>arr[m-1] && arr[m]>arr[m+1]){
                return arr[m];
            }
            if(arr[m] > arr[m-1]){
                s = m+1;
            }
            else{
                e=m-1;
            }
        }
        return -1;
    }
}
