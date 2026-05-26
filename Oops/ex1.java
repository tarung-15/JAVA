public class ex1{
    public static void main(String[] args) {
       Pen p1 =new Pen();//created a pen object called p1
       p1.setColor("Blue");
       System.out.println(p1.color); 

       p1.setTip(5);
       System.out.println(p1.tip);

       p1.setColor("yellow");//or p1.color="yellow";
       System.out.println(p1.color);

       BankAccount myAcc=new BankAccount();
       myAcc.username="Tarun";
       myAcc.setPassword("abc");


       Student st=new Student();
       st.name="TG";
       System.out.println(st.name);
       st.age=21;
       st.calcPercentage(98,99, 99);
       System.out.println(st.percentage);
    }
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password=pwd;
    }
}
//blueprint of pen
class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy,int chem,int math){
        percentage=(phy+chem+math)/3.0f;
    }
}

