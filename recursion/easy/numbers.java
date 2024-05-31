package recursion.easy;
//TC & SC = O(n)
public class numbers {
    public static void main(String[] args) {
        //fun(5);
        fun2(6);
    }

    //print from n to 1
    static void fun2(int n) {
        if (n > 0) { 
            System.out.print(n + " "); 
		    fun2(n - 1);
        }
    }

    //print from 1 to n
    static void fun(int n) {
        if (n > 0) { 
		    fun(n - 1);
            System.out.print(n + " ");
        }
    }
}
