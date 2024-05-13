package recursion;

public class productofdigits {
    public static void main(String[] args) {
        int ans=product(1234);
        System.out.println(ans);
    }

    static int product(int n){
        if(n%10 == n){    //for single digit numbers
            return n;
        }
        return (n%10) * product(n/10);  
    }
}
