import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(ans(n));
    }

    static int check(int n){
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev = rev*10 + rem;
            n = n/10;
        }
        return rev;
    }

    static boolean ans(int n){
        if(n == check(n)){   //n=rev(n)?
            return true;
        }
        return false;
    }
}
