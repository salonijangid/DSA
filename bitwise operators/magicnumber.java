public class magicnumber {
    public static void main(String[] args) {
        //return nth magic num
        /*
        eg- 1st magic num = 0 0 1
        multiply the bits starting from right with 5**n, n=1,2,3,4,... 
        */

        int n=6;
        int ans=0;
        int base=5;

        while(n>0){
            int lastdigit = n & 1;
            n = n >> 1;
            ans = ans + lastdigit * base;
            base = base * 5;
        }
        System.out.println(ans);
    }
}
