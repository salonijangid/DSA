package recursion.strings;

public class skip {
    public static void main(String[] args) {
        skipp ("", "bcaadabc");
        System.out.println(skipp("bcbabaa"));
        System.out.println(skipapple("helloappleworld"));
    }

    //skip "a" in the given word

    static void skipp(String p, String up){
        //p - processed string - initially empty
        //up - unprocessed string - given original string

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);  //start checking from 1st index

        if(ch == 'a'){
            skipp(p, up.substring(1));   // p will be unchanged & from up a will be skipped 
            //beginIndex -> size of the ch or string to be skipped
        }
        else{
            skipp(p+ch, up.substring(1));   //add the ch to p
        }
    }

    //returning it as a string
    static String skipp(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);  

        if(ch == 'a'){
            return skipp(up.substring(1));   
        }
        else{
             return ch + skipp(up.substring(1));   
        }
    }

    //skipping a string
    static String skipapple(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
            return skipapple(up.substring(5));    // size[apple]=5
        }
        else{
             return up.charAt(0) + skipapple(up.substring(1));   
        }
    }
}
