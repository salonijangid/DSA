public class negative {
    public static void main(String[] args) {
        //Q - find -'ve of a num
        //2's complement (i.e complement + 1) gives -'ve of a num
        int n=13;
        System.out.println(neg(n));
    }

    static int neg(int n){
        return ((~n) + 1);
    }
}
