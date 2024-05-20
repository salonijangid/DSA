public class countdigits {
    public static void main(String[] args) {
        int n=1234;
        System.out.println(digit(n));
    }

    static int digits(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }

    //optimal
    static int digit(int n){
        int count = (int)(Math.log10(n)+1);
        return count;
    }
}
