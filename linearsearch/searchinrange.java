package linearsearch;

public class searchinrange {
    public static void main(String[] args) {
        //search ele in given range of indices
        int[] arr={12,23,45,67,98,1,32};
        int data=12;
        int start=1;   
        int end=4;     
        int ans=search(arr, data, start, end);
        System.out.println(ans);
}

static int search(int[] arr, int data, int start, int end){
    if(arr.length==0){
        return-1;
    }
    for(int i=start;i<=end;i++){
        if(arr[i]==data){
            return i;
        }
    }
    return-1;
}
}
