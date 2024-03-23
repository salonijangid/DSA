package linearsearch;
public class searchinstring {
    public static void main(String[] args) {
        String str="hello world";
        char data='s';
        boolean ans=search(str, data);
        System.out.println(ans);
    }

    static boolean search(String str, char data){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(data==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
