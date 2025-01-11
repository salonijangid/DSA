public class palindrome {
    public static void main(String[] args) {
        String str = "abcgba";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        for (int i = 0; i <= str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end) {
                return false;
            }
        }
        return true;
    }
}


/*
static boolean check(String str){
    if (str == null || str.length() == 0) {
            return true;
    }
    
    int s = 0;
    int e = str.length() - 1;
    while(s < e){
        if(str.charAt(s) != str.charAt(e)){
        return false;
        }
        s++;
        e--;
    }
    return true;
 }
 */
