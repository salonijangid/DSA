package strings;

import java.util.Arrays;

//anagram -> letters that make up a word, phrase, or name are rearranged to create new ones
public class anagram {
    public static void main(String[] args) {
        String str1 = "act";
        String str2 = "cat";
        System.out.println(check(str1, str2));
    }

    //TC -> O(n log n) ; SC -> O(1)
    static String sort (String str){
        char c[] = str.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }

    static boolean check (String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        str1 = sort(str1);
        str2 = sort(str2);

        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
