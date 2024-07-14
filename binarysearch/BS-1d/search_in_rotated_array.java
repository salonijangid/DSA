public class search_in_rotated_array {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int target=1;
        System.out.println(search(arr,target));
        System.out.println(count_rotations(arr));
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

    static int findpivotwithduplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //case 1
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            //case 2
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            //case 3
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {    
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;    
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;    
            }
            //case 4
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } 
            //case 5
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

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

    static int search(int[] arr, int target) {
        int pivot = findpivotwithdistinct(arr);
        if (pivot == -1) {
            return bsearch(arr, target, 0 , arr.length - 1);
        }
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

    //COUNT NO. OF ROTATIONS = index of pivot ele + 1
    static int count_rotations (int[] arr){
        int pivot=findpivotwithdistinct(arr);
        return pivot+1;
    }
}
