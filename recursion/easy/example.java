package recursion;
//function call will remain is stack until it is executed
//recursion is a function that calls itself
//types of recurrance relations - linear (eg-fibo), divide & conquer (eg-binary search)
//space complexity = height of the recursive tree i.e path
public class example {
    public static void main(String[] args) {
        //print numbers 1 to 5 using recursion
        print(1);
    }

    static void print(int n){
        if(n==5){    //so add a base condition here to stop the recursion call after this
            System.out.println(5);
            return;
        }

        System.out.println(n);
        //find a recurrance relation
        print(n+1);    //after printing n, the function calls itself for the next num i.e n+1 except for the last i.e 5
    }
}
