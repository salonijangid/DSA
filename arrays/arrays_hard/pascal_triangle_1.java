public class pascal_triangle_1 {
    public static void main(String[] args) {
        int r = 5; 
        int c = 3; 
        int element = pascal(r, c);
        System.out.println(element);
    }
    
    static long nCr(int n, int r) {
        long res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }

    static int pascal(int r, int c) {
        int element = (int) nCr(r - 1, c - 1);
        return element;
    }
}  
        
        