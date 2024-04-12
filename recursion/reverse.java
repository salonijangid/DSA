package recursion;

public class reverse {
    public static void main(String[] args) {
        //rev1(1452);
        //System.out.println(sum);
        System.out.println(rev2(1352));
    }


    //using an static var outside fn
    static int sum = 0;
    static void rev1(int n){
        if(n==0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev1(n/10);
    }


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
