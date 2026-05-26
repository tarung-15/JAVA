package LinkedLists;

public class doublell {
    public class  Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addF(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public void addL(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }
    	public static int removeL(){
		if(size==0){
			System.out.println("LL is empty");
		}else if(size==1){
			int val =head.data;
			tail=head=null;
			size=0;
			return val;
		}
		int val=tail.data;
        tail=tail.prev;
        tail.next=null;
        size--;
        return val;
	}
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        doublell dll=new doublell();
        dll.addF(3);
        dll.addF(2);
        dll.addF(1);
        dll.addL(4);
        dll.removeL();
        dll.print();
        System.out.println(dll.size);
    }
}
