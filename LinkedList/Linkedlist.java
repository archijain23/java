public class Linkedlist {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;


    //function to add at first
    public void addfirst(int data){
        Node newNode= new Node(data);
        //if ll is empty
        if(head==null){
            head=tail=newNode;
            return;
        }
        else{
            newNode.next=head;
            head = newNode;
        }

    }


    //function to add at last
    public void addlast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
              return;
        }
        tail.next=newNode;
        tail=newNode;

    }


    //function to print a linked list
    public void print(){
        if(head==null){
            System.out.println("Linkedlist id empty!");
        }
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.print("null");
    }


    // add in middle
    public void addmiddle(int index,int data){
        if(index==0){
            addfirst(data);
            return;
        }
    Node newNode= new Node(data);
    Node temp=head;
    int i=0;

    while(i<index-1){
        temp=temp.next;
        i++;
    }

    newNode.next=temp.next;
    temp.next=newNode;

    }


    //function to remove first element
    public static
    public static void main(String[] args){
Linkedlist ll=new Linkedlist();
//ll.head=new Node(1);
// ll.head.next=new Node(2);
ll.addfirst(3);
ll.addfirst(1);
ll.addlast(4);
ll.addlast(5);
ll.addmiddle(1,2);
ll.print();
    }
}
