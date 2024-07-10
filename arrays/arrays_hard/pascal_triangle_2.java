public class pascal_triangle_2 {
    public static void main(String[] args) {
        print_row(5);
    }

    static void print_row(int n){
        long ans = 1;
        System.out.print(ans+" ");
        for(int i=1; i<n; i++){
            ans = ans * (n-i);
            ans = ans / i;
            System.out.print(ans+" ");
        }
        System.out.println();
    }
}
