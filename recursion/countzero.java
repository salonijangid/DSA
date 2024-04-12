package recursion;

public class countzero {
    public static void main(String[] args) {
        //count the no. of zeroes in a num i.e when rem = 0
        System.out.println(count(100923076));
    }

    static int count(int n){
        return helper(n, 0);   //initially count is 0
    }

    static int helper(int n, int c){
        if(n==0){
            return c;
        }
        int rem = n%10;
        if(rem==0){
            return helper(n/10, c+1);   //increment count
        }
        return helper(n/10, c);
    }
}
