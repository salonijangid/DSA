public class prime{
    public static void main(String[] args) {
        //check if the numbers are prime or not
        int n=20;
        for(int i=1; i<=n; i++){
            System.out.println(i+" " +isprime(i));
        }
    }

    static boolean isprime(int n){
        if(n<=1){
            return false;
        }

        int start=2;
        while(start*start<=n){      //dont check for repeated ones eg. check only for 2*6 & not 6*2 too
            //current num should be < than sqrt of n
            if(n % start ==0){
                return false;
            }
            start++;
        }
        return true;
    }
}