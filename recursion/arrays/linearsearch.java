package recursion.arrays;

import java.util.ArrayList;

public class linearsearch {
    public static void main(String[] args) {
        int[] arr={12,34,13,56,56,49};
        System.out.println(check(arr, 56, 0));
        System.out.println(findindex(arr, 56, 0));
        System.out.println(findfromlast(arr, 56, arr.length-1));    

        findallindex(arr, 56, 0);
        System.out.println(list);

        ArrayList<Integer> ans = findallindex(arr, 56, 0, new ArrayList<>());
        System.out.println(ans);
        
        System.out.println(findallindex2(arr, 56, 0));
    }

    //check if ele is present or no
    static boolean check(int[] arr, int target, int i){
        if(i == arr.length){
            return false;
        }
        return arr[i] == target || check(arr, target, i+1);
    }


    //find the index at which ele is present
    static int findindex(int[] arr, int target, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        else{
        return findindex(arr, target, i+1);
        }
    }


    //find the index at which ele is present from last
    static int findfromlast(int[] arr, int target, int i){
        if(i == -1){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        else{
        return findindex(arr, target, i-1);
        }
    }


    //if ele has multiple occurences and u want to return all the indices
    //1. using a list outside the fn
    static ArrayList<Integer> list = new ArrayList<>();
    static void findallindex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findallindex(arr, target, index + 1);
    }

    //2. adding it as a parameter & returning the list
    static ArrayList<Integer> findallindex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findallindex(arr, target, index + 1, list);
    }

    //3. using it inside a fn
    static ArrayList<Integer> findallindex2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        
        ArrayList<Integer> ans = findallindex2(arr, target, index + 1);
        list.addAll(ans);
        return list;
    }
}
