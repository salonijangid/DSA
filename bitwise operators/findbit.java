public class findbit {
        public static void main(String[] args) {
            // Return the bit at i'th pos
            int n = 13;
            int i = 3;
            System.out.println(pos(n, i));
        }
    
        static int pos(int n, int i) {
            // Shift n to the right by i positions and then & with 1 to get the bit at i'th position
            return ((n >> i) & 1);
        }
}
    
