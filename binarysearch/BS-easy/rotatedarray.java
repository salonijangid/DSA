public class rotatedarray {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int target=1;
        System.out.println(search(arr,target));
        System.out.println(countrotations(arr));
    }

    //1.find pivot= largest ele which has ascending arrays on both the sides
    //FINDING PIVOT IN ROTATED ARRAY WITH DISTINCT VALUES I.E NO DUPLICATES
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

    //FINDING PIVOT IN ROTATED ARRAY WITH DUPLICATE VALUES
    static int findpivotwithduplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                
                // NOTE: what if these elements at start and end were the pivot??
                // so check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;    //else skip

                // and check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;     //else skip
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
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

    //COUNT NO. OF ROTATIONS = index of pivot ele + 1
    static int countrotations (int[] arr){
        int pivot=findpivot(arr);
        return pivot+1;
    }
}
