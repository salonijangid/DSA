package recursion.easy;

public class fibonacci {
    public static void main(String[] args) {
        //print the nth fibo num
        int n= 6;
        System.out.println(fibo(n));

        for(int i=0; i<15; i++){
            System.out.println(fiboformula(i));
        }
    }


    //so derive a formula
    static long fiboformula(int n){
        return (long) ((Math.pow(((1+Math.sqrt(5))/2), n)-Math.pow(((1-Math.sqrt(5))/2), n))/Math.sqrt(5));
        //can remove -Math.pow(((1-Math.sqrt(5))/2), n)) from the formula too cause it is less dominating
    }


    
    //wont give ans for numbers>40 cause this has exponential complexity
    static int fibo(int n){
        //base condition is what is already given i.e fibo(0)=0 & fibo(1)=1
        if(n < 2){
            return n;
        }
        //sum of prev 2 num - recurrance relation
        return fibo(n-1) + fibo(n-2);
    }
}
