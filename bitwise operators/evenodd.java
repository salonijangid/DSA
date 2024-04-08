public class evenodd {
    public static void main(String[] args) {
        int n=31;
        System.out.println(isEven(n));
    }

    static boolean isEven(int n){
        //eg. in 101001, except the LSB (least significant bit) which is of 2**0, all are even cause they are 2**n, n=1,2,3,...
        return (n & 1) != 1;  //so depends only on the last digit
        //any num & 1 gives the num itself
    }
}
