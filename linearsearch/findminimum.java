package linearsearch;

public class findminimum {
    public static void main(String[] args) {
        int[] arr={12,23,-1,45,89};
        System.out.println(min(arr));
}   

static int min(int[] arr){
    int ans=arr[0];
    if(arr.length==0){
        return-1;
    }
    for(int i=1;i<arr.length;i++){
        if(arr[i]<ans){
            ans=arr[i];
            return ans;
        }
    }
    return arr[0];   //if the first ele is only minimum, returns here
}
}
