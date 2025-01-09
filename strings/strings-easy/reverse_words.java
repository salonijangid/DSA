public class reverse_words {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(rev_words(s));
    }

    static String rev_words(String s){
        s=s.trim();
        String[] words=s.split("\\s+");

        StringBuilder rev = new StringBuilder();

        for(int i=words.length-1; i>=0; i--){
            rev.append(words[i]);
            if(i!=0){
                rev.append(" ");
            }
        }
        return rev.toString();
    }
}
