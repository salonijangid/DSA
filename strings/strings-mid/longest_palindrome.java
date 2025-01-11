public class longest_palindrome {
    public static void main(String[] args) {
        String s ="babad";
        System.out.println(longestPalindrome(s));
    }

    static String longestPalindrome(String s) {
        int n = s.length();
        String longest = "";

        for(int i =0; i<n; i++){
            for(int j=i; j<n; j++){
                String sub = s.substring(i, j+1);
                if(pal(sub) && sub.length() > longest.length()){
                    longest = sub;
                }
            }
        }
        return longest;
    }

    public static boolean pal(String s){
        int l = 0 ;
        int r = s.length()-1;

        while(l<r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
