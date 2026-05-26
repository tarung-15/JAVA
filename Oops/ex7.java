public class ex7 {
    public static void main(String[] args) {
        Queen q=new Queen();
        q.moves();
        Bear b=new Bear();
        b.eat();
    }
}
//multiple interface -HW
interface Herbivore{
    void eatplant();
}
interface Carnivore{
    void eatmeat();
}
class Bear implements Herbivore, Carnivore{
    public void eatplant(){
        System.out.println("eating plant");
    }
    public void eatmeat(){
        System.out.println("eatinf meat");
    }
    public void eat(){
        eatplant();
        eatmeat();;
        System.out.println("bear is omnivore");
    }
}
interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal(in all 4 dir)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal(by 1 step)");
    }
}
