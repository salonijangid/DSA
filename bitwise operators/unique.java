public class unique {
    public static void main(String[] args) {
        //every ele occurs twice, find the unique ele
        int[] arr={2,3,2,4,6,4,3};
        System.out.println(ans(arr));
    }

    //XOR- if and only if one of the input is true
    /*
    a ^ 1 = 1
    a ^ 0 = a
    a ^ a = 0
    */

    static int ans(int[] arr){
        int ele=0;
        for(int n : arr){
            ele = ele^n;   //xor every ele cause a^a=a and unique ele returned
        }
        return ele;
    }
}
