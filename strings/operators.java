package strings;

public class operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');   //characters - ascii val
        System.out.println("a" + "b");   //strings
        System.out.println((char)('a' + 3));  //type casting
        System.out.println("a" + 1);  //when int is concated to a string, its converted to an int wrapper class
        System.out.println("hello" + new Integer(12));  //wrapper class calls toString()


        //stores a large space cause creates new obj every time the for loop runs
        String alphabets = "";
        for(int i = 0; i < 26; i++){
            char letter = (char)('a' + i);
            alphabets += letter;
        }
        System.out.println(alphabets);


        //alternative - use StringBuilder
        //uses less space cause only adds to prev string
        StringBuilder letters = new StringBuilder();
        for(int i = 0; i < 26; i++){
            char ch = (char)('a' + i);
            letters.append(ch);    //many stringbuilder fns are available
        }
        System.out.println(letters.toString());
        
    }
}
