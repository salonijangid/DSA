package arrays_easy;

public class num_appears_once {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        //System.out.println(search(arr));
        System.out.println(search2(arr));
    }

    //brute force
    static int search(int[] arr){
        for(int i=0; i<arr.length; i++){
            int num = arr[i];
            int count=0;
            for(int j=0; j<arr.length; j++){
                if(arr[j]==num){
                    count++;
                }
            }
            if (count==1) return num; 
        }
        return -1;
    }

    //optimal
    static int search2(int[] arr){
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            ans = ans ^ arr[i];
        }
        return ans;
    }
}
