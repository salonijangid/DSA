package strings.extra;
//pangram - all letters appear at least once
public class pangram {
    public static void main(String[] args) {
        String sentence = "hello";
        System.out.println(checkIfPangram(sentence));
    }

    public static boolean checkIfPangram(String sentence) {
        sentence = sentence.toLowerCase();
        String letters = "abcdefghijklmnopqrstuvwxyz";
        //convert the string to a char array and check
        for(char ch : letters.toCharArray()){
            //if it doesnt contain all the letters
            if(!sentence.contains(String.valueOf(ch))){
                return false;
            }
        }
        return true;
    }
}
