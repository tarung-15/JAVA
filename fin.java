public class Node{
    int data;
    Node next;
    public Node(int data){
        this.next=next;
        this.data=data;
    }
}
public class fin {
    public static Node head,tail;
    public static int size;

    public static void addfirst(int data){
        Node newNode =new Node(data);
        if(head==null){
            head=newNode;
        }
        newNode.next=head;
        head=newNode;
    }
    public static void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public static int deleteF(){
        if(size==0){
            return -1;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    public static int deleteL(){
        if(size==0){
            return -1;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node temp=head;
        for(int i=0;i<size-2;i++){
            temp=temp.next;
        }
        int val=temp.next.data;
        temp.next=null;
        size--;
        return val;
    }
    public void print(){
        if(head==null){
            System.out.println("empty");
        }
        Node temp=head;
        while(head!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void add(int data,int idx){
        Node newNode =new Node(data);
        if(idx==0){
            addfirst(data);
        }
        int i=0;
        Node temp=head;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public static void rev(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
    }
    public static int search(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public static int 

}
