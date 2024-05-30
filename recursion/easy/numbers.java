package recursion.easy;

public class numbers {
    public static void main(String[] args) {
        //fun(5);
        fun_rev(5);
    }

    //print from n to 1
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.print(n);
        fun(n-1);
    }

    //print from 1 to n
    static void fun_rev(int n) {
        if (n == 0) {
            return;
        }
        fun_rev(n-1);
        System.out.print(n+" ");
    }
}
