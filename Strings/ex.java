public class ex {
    public static void types(String str){
        String vowels="aeiouAEIOU";
        for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(vowels.indexOf(ch) != -1){ //for consonents == 
            System.out.println(ch +" ");
        }
        if(Character.isLowerCase(ch)){
            System.out.println(ch); //upper and lower
        }
        if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
            System.out.println(ch + " "); //special char
        }
        if (Character.isDigit(ch)) {
            System.out.println(ch + " "); //only numbers
        }
    }
}

    public static void main(String[] args) {
        String str="taRun@56";
        //types(str);
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch == 'a' || ch== 'e' || ch== 'i' ||ch== 'o' ||ch =='u'){
              count++;
            }
        }
        System.out.println(count);
    }
}
