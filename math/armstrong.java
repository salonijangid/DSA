public class armstrong {
    public static void main(String[] args) {
        int n=153;
        if(check(n)){
            System.out.println("armstrong num");
        }
        else{
            System.out.println("not an armstrong num");
        }
    }

    static boolean check(int n){
       int len = String.valueOf(n).length();
       double sum=0;
       int num=n;
       while(num>0){
            int rem = num % 10;
            sum = sum + Math.pow(rem, len);
            num = num/10;
       }
       return sum == n ? true : false;
    }
}
