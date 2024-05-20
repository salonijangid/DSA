public class reverse {
    public static void main(String[] args) {
        System.out.println(rev(1234));
    }

    static int rev(int n){
        int revnum=0;
        while(n>0){
            int rem=n%10;
            revnum = revnum * 10 + rem;
            n = n/10;
        }
        return revnum;
    }
}
