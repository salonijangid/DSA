public class rotated_str {
    public static void main(String[] args) {
        String a = "abcde";
        String b = "deabc";
        System.out.println(check(a, b));
    }

    //check if 'b' is a rotated string of 'a'
    static boolean check(String a, String b){
        if(a.length() != b.length()){
            return false;
        }
        String concate = a+a;
        return concate.contains(b);
    }
}
