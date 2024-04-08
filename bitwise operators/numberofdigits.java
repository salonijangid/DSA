public class numberofdigits {
    public static void main(String[] args) {
        //find num of digits in n in the given base value
        int n=1234;
        int b=8;
        //no. of digits in base b of num n = log n to base b + 1
        int ans = (int) (Math.log(n) / Math.log(b)) + 1;
        //log a to base b = log a to base x / log b to base x
        System.out.println(ans);    
    }
}
