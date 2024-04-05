public class answers {
    public static void main(String[] args) {
        pattern1(5); 
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern28(5);
        pattern30(5);
        pattern17(4);
        pattern31(4);
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
        for (int row = 1; row < 2 * n; row++) {   //n is 5, and pattern has 9 lines so its equal to 2n-1
            int totalcol = row > n ? 2 * n - row : row; 
            // if row no. is > n then to find col get a formula like 2*n-row-1
            // else row = col
            for (int col = 0; col < totalcol; col++) {   
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void pattern28(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalcol = row > n ? 2 * n - row: row;

            int noofspaces = n - totalcol;
            for (int s = 0; s < noofspaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalcol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n-row; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {   //eg 4 3 2 1 
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {   //then 2 3 4 
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n) {
        for (int row = 1; row <= 2*n; row++) {
            int totalcol = row>n ? 2*n-row : row;
            for (int space = 0; space < n-totalcol; space++) {
                System.out.print("  ");
            }
            for (int col = totalcol; col >= 1; col--) {   //eg 4 3 2 1 
                System.out.print(col + " ");
            }
            for (int col = 2; col <= totalcol; col++) {   //then 2 3 4 
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern31(int n){
        int originaln= n;
        n= 2*n;
        for(int row=0; row<=n; row++){
            for(int col=0; col<=n;col++){
                //value at any pos in the pattern is = to min. of its distances from all 4 sides
                //distances- left=col; top=row; right=n-col; down=n-row
                int pos= originaln -Math.min(Math.min(row,col), Math.min(n-row,n-col));
                System.out.print(pos+ " ");
            }
            System.out.println();
        }
    }
}
