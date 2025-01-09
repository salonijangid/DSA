public class isomorphic {
    public static void main(String[] args) {
        String s1 = "lskp";
        String s2 = "ammn";
        System.out.println(check(s1, s2));
    }

    static boolean check(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        int[] m1 = new int[256];
        int[] m2 = new int[256];

        for(int i=1; i<s1.length(); i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if(m1[c1]!=0 && m1[c1]!=c2){
                return false;
            }
            m1[c1]=c2;

            if(m2[c2]!=0 && m2[c2]!=c1){
                return false;
            }
            m2[c2]=c1;
        }
        return true;
    }
}
