package arrays_mid;

public class majority_ele_occuring_morethan {
    public static void main(String[] args) {
        int[] a ={2,2,1,1,1,2,2};
        System.out.println(element(a));
    }

    //TC -> O(N^2) ; SC -> O(1)
    static int element(int[] a){
        int n = a.length;
        for(int i=0; i<n; i++){
            int count=0;
            for(int j=0; j<n; j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count > (n/2)){
                return a[i];
            }
        }
        return -1;
    }
}
