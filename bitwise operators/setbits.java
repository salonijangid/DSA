public class setbits {
        public static void main(String[] args) {
        //find num of set bits i.e 1's
        int n=9;
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
