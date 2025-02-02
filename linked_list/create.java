package linked_list;

import java.util.*;

public class create {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();   
        for(int i=0; i<n; i++){
            int a = s.nextInt();
            l.add(a);
        }
        int b = l.removeLast();
        for(int i=0; i<n-1; i++){
            System.out.print(l.get(i)+"->");
        }
        System.out.println(b);

        s.close();
    }
}
