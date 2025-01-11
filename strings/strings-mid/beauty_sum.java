public class beauty_sum {
    public static void main(String[] args) {
        String s = "aabcb";
        System.out.println(sum(s));
    }

    static int sum(String s){
        int n = s.length();
        int b = 0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                String sub = s.substring(i, j+1);
                b = b + freq(sub);
            }
        }
        return b;
    }

    static int freq(String s){
        int[] freq = new int[128];
        
        for(char c : s.toCharArray()){
            freq[c]++;
        }
    
        int max = 0;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<128; i++){
            if(freq[i] > 0){
            if(freq[i] > max){
                max = freq[i];
            }
            if(freq[i] < min){
                min = freq[i];
            }
        }
        }
        return max-min;
    }
}
