public class divisors {
    public static void main(String[] args) {
        //div1(12);
        div2(12);
    }

    static void div1(int n){
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }

    static void div2(int n){
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i+" ");
                if(i!=n/i){
                    System.out.print(n/i+" ");
                }
            }
        }
    }
}