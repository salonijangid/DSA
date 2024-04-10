public class sieve {
    public static void main(String[] args) {
        //find prime numbers from 0 to n using sieve of eratosthenes
        //eliminating the multiples of a num i.e prime
        int n=40;
        boolean[] primes= new boolean[n+1];   //cause 40 should be included too
        sievee(n,primes);
    }

    static void sievee(int n, boolean[] primes){
        for(int i=2; i*i<n; i++){
            //initially all ele in array primes is false
            if(!primes[i]){
                //false -> if its prime, make all its multiples true
                for(int j=i*2; j<=n; j=j+i){
                    primes[j]= true;
                }
            }
        }
        for(int i=2; i<=n; i++){
            //print all false i.e prime num
            if(!primes[i]){
                System.out.println(i+" ");
            }
        }
    }
}
