package arrays_easy;

public class remove_duplicates {
    public static void main(String[] args) {
        int[] nums={1,1,2,3,4,5,7,7};
        int a = remove(nums);
        for(int i=0; i<a; i++){
            System.out.print(nums[i]+" ");
        }
    }

    //TC = O(N) & SC = O(1)
    static int remove(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(i<nums.length-1 && nums[i]==nums[i+1]){
                continue;
            }
            else{
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}
