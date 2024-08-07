public class binarysearchsqrt {
    public static void main(String[] args) {
        //find sqrt of a num using binary search
        int n=40;
        int p=3;  //precision i.e till what decimal

        System.out.println(sqrt(n,p));
        System.out.printf("%.3f", sqrt(n,p));   //to print upto 3 decimals only
    }

    static double sqrt(int n, int p){
        int s=0;
        int e=n;
        double root=0.0;
        while(s<=e){
            int m=s+(e-s)/2;
            if(m*m == n){
                return m;
            }
            else if(m*m > n){
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        //to find decimal values
        double increment=0.1;
        for(int i=0; i<p; i++){
            while(root*root <= n){
                root=root+increment;
            }
            //if it exceeds the n, prev ans is taken
            root=root-increment;
            //to find next decimal value
            increment=increment/10;   //eg- first its 0.1, then 0.01, 0.001 etc
        }
        return root;
    }
}
