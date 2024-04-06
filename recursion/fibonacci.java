package recursion;

public class fibonacci {
    public static void main(String[] args) {
        //print the nth fibo num
        //wont give ans for numbers>40 cause this has exponential complexity
        int n= 6;
        System.out.println(fibo(n));
    }

    static int fibo(int n){
        //base condition is what is already given i.e fibo(0)=0 & fibo(1)=1
        if(n < 2){
            return n;
        }
        //sum of prev 2 num - recurrance relation
        return fibo(n-1) + fibo(n-2);
    }
}
