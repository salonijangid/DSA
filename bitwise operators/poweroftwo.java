public class poweroftwo{
    public static void main(String[] args) {
        //check if the given num is a power of 2 or no
        int n= 16;
        boolean ans = (n & (n - 1))==0;
        System.out.println(ans);
    }
}