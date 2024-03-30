package sorting;

import java.util.ArrayList;
import java.util.List;

//1 to n ele in an array, find duplicates
public class duplicatenum {
    public static void main(String[] args) {
        
    }

    public List<Integer> findDuplicates(int[] arr) {
        //cyclic sort
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1) {
                ans.add(arr[index]);   //adding ele to the list that are not in correct index i.e finding duplicate num
            }
        }

        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
