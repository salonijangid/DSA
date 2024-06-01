package linearsearch;
public class linearsearch {
    public static void main(String[] args) {
        int[] arr={12,13,34,56,7,8,90};
        int data=34;
        int ans=search(arr, data);
        System.out.println(ans);
    }
    //TC - O(N) ; SC = O(1)
    static int search(int[] arr, int data){
        if(arr.length==0){
            return 1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==data){
                return i;
            }
        }
        return -1;
    }
}
