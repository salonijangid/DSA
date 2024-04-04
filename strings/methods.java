package strings;

import java.util.Arrays;

public class methods {
    public static void main(String[] args) {
        String name = "dsa java";
        System.out.println(Arrays.toString(name.toCharArray()));  //converts each char to array
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf('v'));
        System.out.println(name.charAt(1));
        System.out.println("      hello      ".strip());  //removes spaces
        System.out.println(Arrays.toString(name.split(" ")));  //cuts the string into arrays at whatever is given
    }
}
