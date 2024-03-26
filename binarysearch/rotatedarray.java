package binarysearch;
//searching in rotated array with distinct values i.e no duplicates
public class rotatedarray {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(search(arr,target));
    }

    //1.find pivot= largest ele which has ascending arrays on both the sides
    static int findpivot(int[] arr){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            //4 cases to find the pivot
            if(mid<end && arr[mid]>arr[mid+1]){         //mid ele cant be at last pos cause no mid+1 
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){       //mid ele cant be at start pos cause no mid-1
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }

    //2. applying binary search to both the ascending arrays to find target data
    static int bsearch(int[] arr, int data, int start, int end){
        while(start<=end){
            int mid=(start+end)/2;
            if(data==arr[mid]){              
                return mid;
            }
            else if(data<arr[mid]){          
                end=mid-1;
            }
            else{                         
                start=mid+1;
            }
        }
        return -1;        
    }

    //3. find the req. target data
    static int search(int[] arr, int target) {
        int pivot = findpivot(arr);

        // if you did not find a pivot, it means the array is not rotated
        if (pivot == -1) {
            // just do normal binary search
            return bsearch(arr, target, 0 , arr.length - 1);
        }

        // if pivot is found, you have found 2 asc sorted arrays
        if (arr[pivot] == target) {
            return pivot;
        }

        if (target >= arr[0]) {
            return bsearch(arr, target, 0, pivot - 1);
        }
        else{
        return bsearch(arr, target, pivot + 1, arr.length - 1);
        }
    }
}
