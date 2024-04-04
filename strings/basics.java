package strings;

import java.util.Arrays;

public class basics {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        System.out.println(a==b);  //will give true cause a and b are pointing to the same object hello in the string pool

        String c = new String("hello");
        String d = new String("hello");
        System.out.println(c==d);  //will give false cause c and d are creating 2 new diff objects in the heap 

        System.out.println(c.equals(d));  //will give true cause the method only checks if the values are same
        System.out.println(c.charAt(4));

        System.out.println(45);   //will print all these as strings
        System.out.println("hi");
        System.out.println(new int[]{2,3,4,5});  //will give error cause ur using default toString method
        System.out.println(Arrays.toString(new int[]{2,3,4}));  //creating ur own toString method

        
        Integer n = new Integer(23);   //wrapper class
        System.out.println(n.toString()); 

        //pretty printing
        float num = 124.345812f;
        System.out.printf("formatted number is %.3f %n", num);   //printf cause it is an formatted string
                                    // % is a placeholder that rounds off and prints upto given decimals for eg. here till 3 decimals
        

        System.out.printf("pi value upto 2 decimals are %.2f %n", Math.PI);  

        System.out.printf("%s dept. and %s course", "aiml", "java");

        /*  PLACEHOLDERS
                %c - Character
                %d - Decimal number (base 10)
                %e - Exponential floating-point number
                %f - Floating-point number
                %i - Integer (base 10)
                %o - Octal number (base 8)
                %s - String
                %u - Unsigned decimal (integer) number
                %x - Hexadecimal number (base 16)
                %t - Date/time
                %n - Newline 
        */
    }
}
