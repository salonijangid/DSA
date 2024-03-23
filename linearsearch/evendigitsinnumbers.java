package linearsearch;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class evendigitsinnumbers {
    public static void main(String[] args) {
        
    int[] arr={1,345,1112,245,27};
    int ans=findnum(arr);
    System.out.println(ans);
    }

    static int findnum(int[] arr){
        int count=0;
        for(int num:arr){
            if(even(num)){  
                count++;       //returning count of the number of even elements present
            }
        }
        return count;
    }

    static int digits(int num){
        int count=0;

        //if any ele entered in array is negative, and u want it to be counted, add an if statement like
        if(num<0){
            num=num*-1;        //will make any negative input to positive so it can be counted as well
        }
        while(num>0){
            count++;                 //counts each digit every time it divides by 10 until n=0
            num=num/10;              // eg- n=123, count=0, n/=10 count=1 n=12, n/=10 count=2 n=1, n/=10 count=3 n=0
        }
        return count;    //count=3 therefore n has 3 digits
    }

    static boolean even(int num){
        int numofdigits=digits(num);     //check if the digit is even number or no
        while(numofdigits%2==0){
            return true;
        }
        return false;
    }
}


//optimized-
/*
 public static int findNumbers(int[] nums) {
        int count=0;
        for(int i=0; i<nums.length; i++){
            int digit=0;
            while(nums[i]>0){
                nums[i]/=10;
                digit++;
            }if(digit%2==0){
                count++;
            }
        }return count;
    }
}
 */