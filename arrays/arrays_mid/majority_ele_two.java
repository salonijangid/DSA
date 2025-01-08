package arrays_mid;

public class majority_ele_two{
    public static void main(String[] args) {
        int[] a ={2,2,1,1,1,2,2};
        System.out.println(element_brute(a));
        System.out.println(element_optimal(a));
    }

    static int element_brute(int[] a){
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

    static int element_optimal(int[] a){
        int ele=0;
        int count=0;
        for(int i=0;i<a.length; i++){
            if(count==0){
                count=1;
                ele=a[i];
            }
            else if(a[i]==ele){
                count++;
            }
            else{
                count--;
            }
        }
        int cnt=0;
        for(int i=0; i<a.length;i++){
            if(a[i]==ele){
                cnt++;
            }
        }
        if(cnt > a.length/2){
            return ele;
        }
        return -1;
    }
}
