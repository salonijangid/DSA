public class freq_sort {
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(sort(s));
    }

    static String sort(String s){
        int[] freq = new int[128];
        
        for(char c : s.toCharArray()){
            freq[c]++;
        }

        StringBuilder sorted = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            int maxfreq = 0;
            int maxchar = 0;

            for(int j=0; j<128; j++){
                if(freq[j] > maxfreq){
                    maxfreq = freq[j];
                    maxchar = j;
                }
            }

            for(int k=0; k< maxfreq; k++){
                sorted.append((char) maxchar);
            }
            freq[maxchar] = 0;
        }
        return sorted.toString();
    }
}
