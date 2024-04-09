public class findXOR {
    public static void main(String[] args) {

        //find XOR from 0 to a
        /*
         if a % 4 = 0 -> a
         if a % 4 = 1 -> 1
         if a % 4 = 2 -> a+1
         if a % 4 = 3 -> 0
        */

        //find XOR  of all num between a & b

        // range xor for a, b = xor(b) ^ xor(a-1)
        int a = 3;
        int b = 9;

        int ans = xor(b) ^ xor(a-1);

        System.out.println(ans);
    }

    //gives xor from 0 to a
    static int xor(int a) {
        if (a % 4 == 0) {
            return a;
        }

        if (a % 4 == 1) {
            return 1;
        }

        if (a % 4 == 2) {
            return a + 1;
        }

        return 0;
    }
}
