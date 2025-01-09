public class largest_odd_num {
    public static void main(String[] args) {
        String s = "35427";
        System.out.println(find(s));
    }

    static String find(String s){
        for(int i=s.length()-1; i>=0; i--){
            char c = s.charAt(i);
            if((c-'0') % 2 == 1){
                return s.substring(i,i+1);  // (0,i+1) if you want to return the whole num if its odd originally
            }
        }
        return "";
    } 
}