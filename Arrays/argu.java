public class argu {
    public static void Update(int marks[],int nonchangeable){
        nonchangeable=10;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={97,98,99};
        int nonchangeable=5;
        Update(marks,nonchangeable);
       System.out.println(nonchangeable);
        //print marks
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+ " ");
        }
        System.out.println();
    }
    
}
