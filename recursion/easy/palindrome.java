package recursion.easy;

public class palindrome {
    public static void main(String[] args) {
        System.out.println(check(12321));
    }


    static boolean check(int n){
        return n == rev2(n);
    }
    

    //reverse
    static int rev2(int n){
        //using any additional say helper fn and passing an argument
        int digits = (int)(Math.log10(n)+1);   //to find no. of digits
        return helper(n, digits);
    }


    static int helper(int n, int digits) {
        if(n % 10 == n){
            return n;
        }
        int rem =  n%10;
        return rem * (int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
        //eg- 1234 -> 4 * 10**3 + 123; 43 * 10**2 +12 etc
    }
}
