public class newtonsqrt {
    public static void main(String[] args) {
        //find sqrt of a num using newton raphson method
        System.out.println(sqrt(40));
    }
    static double sqrt(double n){
        //formula -> root = (x + n/x)/2
        //1. assign x to n  (x is the guess, n is the actual root)
        //2. error = root-x; error<bound -> ans; error bound can be taken anything
        //3. update x=root

        double x=n;   //1
        double root;
        while(true){
            root=0.5*(x+(n/x));
            if(Math.abs(root-x) < 0.5){   //2
                break;
            }
            x=root;  //3
        }
        return root;
    }
}
