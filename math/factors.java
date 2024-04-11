import java.util.ArrayList;

public class factors {
    public static void main(String[] args) {
        //factor1(20);
        //factor2(20);
        factor3(20);
    }

    //time = O(n)
    static void factor1(int n){
        for(int i=1; i<=n; i++){
            if(n % i ==0){
                System.out.print(i + " ");
            }
        }
    }

    //time = O(sqrt(n))
    //to eliminate repeated eg 2*3 & 3*2
    static void factor2(int n){
        for(int i=1; i<= Math.sqrt(n); i++){   
            if(n % i ==0){
                if(n % i ==i){
                    System.out.print(i);
                }
                else{
                System.out.print(i + " " + n/i + " ");
                }
            }
        }
    }

    //both space and time = O(sqrt(n))
    //to store factor2 in sorted order
    static void factor3(int n){
        //store in list
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<= Math.sqrt(n); i++){   
            if(n % i ==0){
                if(n % i ==i){
                    System.out.print(i);
                }
                else{
                System.out.print(i + " ");
                list.add(n/i);
                }
            }
        }
        for(int i=list.size()-1; i>=0; i--){    //its in descending order so print from last, eg 20 10 5
            System.out.print(list.get(i) + " ");
        }
    }
}
