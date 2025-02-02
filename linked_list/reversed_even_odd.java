package linked_list;

import java.util.*;

public class reversed_even_odd {
    public static void main(String[] args) {
        LinkedList <Integer> l = new LinkedList<>();
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        for(int i = 0; i<n; i++){
            l.add(s.nextInt());
        }
        
        Collections.reverse(l);
        for(int i=0; i<n; i++){
            if(l.get(i)%2==0){
                System.out.print(l.get(i)+" ");
            }
        }
        for(int i=0; i<n; i++){
            if(l.get(i)%2!=0){
                System.out.print(l.get(i)+" ");
            }
        }

        s.close();
    }
}
