public class setbits {
        public static void main(String[] args) {
        //find num of set bits i.e 1's
        int n=9;
        /*
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toHexString(n));
        System.out.println(Integer.toOctalString(n));
        */
        int count=0;
        while(n>0){
            if((n & 1) == 1){
                count++;
            }
            n= n>>1;
        }
        System.out.println(count);
    }
}
