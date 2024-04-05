public class answers {
    public static void main(String[] args) {
        pattern1(5); 
        pattern2(5);
        pattern3(5);
        pattern4(5);
    }

    static void pattern1(int n) {   
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {   
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {    
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {   
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {   
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row+1; col++) {   
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {   
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {   
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {   
        for (int row = 1; row <= 2 * n - 1; row++) {   //n is 5, and pattern has 9 lines so 2n-1
            for (int col = 1; col <= row; col++) {   
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

}
