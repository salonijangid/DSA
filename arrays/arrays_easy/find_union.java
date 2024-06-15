package arrays_easy;

import java.util.ArrayList;

public class find_union {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5};
        ArrayList <Integer> Union = find(arr1, arr2, 5, 5);
        for(int val : Union){
            System.out.print(val+" ");
        }
    }

    static ArrayList<Integer> find(int[] arr1, int[] arr2, int n, int m){
        int i=0; 
        int j=0;
        ArrayList <Integer> Union = new ArrayList<>();
        while(i<n && j<m){
            if(arr1[i] < arr2[j]){
                if(!Union.contains(arr1[i])){
                    Union.add(arr1[i]);
                }
                i++;
            }
            else if(arr1[i] > arr2[j]){
                if(!Union.contains(arr2[j])){
                    Union.add(arr2[j]);
                }
                j++;
            }
            else{
                if(!Union.contains(arr1[i])){
                    Union.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        while(i<n){
            if(!Union.contains(arr1[i])){
                Union.add(arr1[i]);
            }
            i++;
        }
        while(j<m){
            if(!Union.contains(arr2[j])){
                Union.add(arr2[j]);
            }
            j++;
        }
        return Union;
    }
}