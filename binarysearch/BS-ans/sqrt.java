public class sqrt {
    public static void main(String[] args) {
        int n=28;
        System.out.println(sq_brute(n));

        int ans=(int) Math.sqrt(n);
        System.out.println(ans);

        System.out.println(sq_bs(n));
    }
    public static int sq_brute(int n){
        int ans=0;
        for(int i=0; i<=n;i++){
            if(i*i<=n){
                ans=i;
            }else{
                break;
            }
        }
        return ans;
    }

    
    public static int sq_bs(int n){
        int s = 0;
        int e = n;
        int ans = 0;
        while (s <= e) {
            int m = s + (e - s) / 2; 
            int square = m * m;
            if (square == n) {
                return m;
            } else if (square < n) {
                ans = m;
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return ans;
    }
}
