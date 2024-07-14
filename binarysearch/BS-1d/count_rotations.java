public class count_rotations {
    public static void main(String[] args) {
        int[] arr ={4,5,6,7,0,1,2};
        System.out.println(count_1(arr));
    }

    //NO. OF ROTATIONS = index of pivot ele + 1
    static int count_1 (int[] arr){
        int pivot=findpivotwithdistinct(arr);
        return pivot+1;
    }
    static int findpivotwithdistinct(int[] arr){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            //case 1
            if(mid<end && arr[mid]>arr[mid+1]){         
                return mid;
            }
            //case 2
            if(mid>start && arr[mid]<arr[mid-1]){       
                return mid-1;
            }
            //case 3
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            //case 4
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
