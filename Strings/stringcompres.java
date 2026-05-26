public class stringcompres {
    public static String compress(String str){
        String newStr="";

        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count >1){
                newStr += count.toString();
            }
        }
        return newStr;
    }
    //leetcode-3163
    public  static String compressedString(String word) {
        StringBuilder comp = new StringBuilder();
        int n = word.length();
        int i = 0;

        while (i < n) {
            char currentChar = word.charAt(i);
            int count = 0;
            while (i < n && word.charAt(i) == currentChar && count < 9) {
                count++;
                i++;
            }
            comp.append(count).append(currentChar);
        }
        return comp.toString();
    }
    public static void main(String[] args) {
        String str = "aaaabbbcccdddd";
        System.out.println(compress(str));
    }
}
