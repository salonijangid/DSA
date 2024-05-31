package recursion.easy;
//TC = O(N) ; SC = O(1)
public class reverse_arr {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] revarr=rev(arr, 0, arr.length-1);
        for(int i : revarr){
            System.out.print(i+" ");
        }
    }

    static int[] rev(int[] arr, int s, int e){
        if(s>=e){
            return arr;
        }
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
        return rev(arr, s+1, e-1);
    }
}
