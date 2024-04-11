public class gcdlcm {
    public static void main(String[] args) {
        System.out.println(gcd(4,8));
        System.out.println(lcm(2, 7));
    }

    static int gcd(int a, int b){
        //euclidean theorem
        //gcd(a,b) = gcd(remainder (a,b), a)
        if(a == 0){
            return b;    //eg. gcd(0,23) = 23
        }
        return gcd(b % a, a);
    }

    static int lcm(int a, int b){
        return a * b/ gcd(a, b);
    }
}
