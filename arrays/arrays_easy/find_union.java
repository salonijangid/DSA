package arrays_easy;
import java.util.ArrayList;
import java.util.TreeSet;

public class find_union {
    public static void main(String[] args) {
        int[] arr1 = {-7, 8};
        int[] arr2 = {-8, 3, 8};
        
        // Pass the actual lengths of the arrays to the method
        ArrayList<Integer> Union = find(arr1, arr2, arr1.length, arr2.length);
        
        for (int val : Union) {
            System.out.print(val + " ");
        }
    }

    static ArrayList<Integer> find(int[] arr1, int[] arr2, int n, int m) {
        int i = 0;
        int j = 0;
        TreeSet<Integer> UnionSet = new TreeSet<>();
        
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                UnionSet.add(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                UnionSet.add(arr2[j]);
                j++;
            } else {
                UnionSet.add(arr1[i]);
                i++;
                j++;
            }
        }
        
        while (i < n) {
            UnionSet.add(arr1[i]);
            i++;
        }
        
        while (j < m) {
            UnionSet.add(arr2[j]);
            j++;
        }

        return new ArrayList<>(UnionSet);
    }
}
