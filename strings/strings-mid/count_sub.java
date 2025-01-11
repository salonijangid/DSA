public class count_sub {
    public static void main(String[] args) {
        String s = "aba";
        int k = 2;
        System.out.println(countSubstr(s, k));
    }

    static int countSubstr(String s, int k) {
        int n = s.length();
        int count = 0;
        
        for(int i=0; i<n; i++){
            int distinct = 0;
            int[] freq = new int[26];
            
            for(int j=i; j<n; j++){
                char c = s.charAt(j);
                
                if(freq[c - 'a'] == 0){
                    distinct++;
                }
                freq[c - 'a']++;
                
                if(distinct > k){
                    break;
                } 
                
                if(distinct == k){
                    count++;
                }
            }
        }
        return count;
    }
}

