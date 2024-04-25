package recursion.strings;

import java.util.ArrayList;

public class subsequence {
    public static void main(String[] args) {
        //return all the possible subsets of a string
        seq("", "abc");
        System.out.println(seq_return("", "abc"));
    }

    static void seq(String p, String up){
        //base condition - return p when up is empty
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        //either take the string or ignore it
        seq(p+ch, up.substring(1));   //take the ch
        seq(p, up.substring(1));      //ignore the ch
    }


    //returning it as a list
    static ArrayList<String> seq_return(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = seq_return(p+ch, up.substring(1));
        ArrayList<String> right = seq_return(p, up.substring(1));

        left.addAll(right);
        return left;    //or return right
    }
}
