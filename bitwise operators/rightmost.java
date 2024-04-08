public class rightmost {
    public static void main(String[] args) {
        //find the right most set bit i.e the rightmost 1
        int n=14;   //1110
        System.out.println(right(n));
    }

    static int right(int n){
        return (n & (-n));  //take 2's complement -> 0010 -> ans = 2
    }
}
