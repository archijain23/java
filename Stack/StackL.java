//implementation of stack using linked list
import java.util.*;

public class StackL {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    static class Stack{
static Node head=null;

//check empty
public static boolean isEmpty(){
    return head==null;
}

//push
public static void push(int data){
    Node newNode=new Node(data);
    if(isEmpty()){
        head=newNode;
        return;
    }
    newNode.next=head;
    head=newNode;
}

//pop
public static int pop(){
    if(isEmpty()){
        return -1;
    }
    int top=head.data;
    head=head.next;
    return top;
}

//peek
public static int peek(){
    int top=head.data;
    return top;
}
    }

    public static void main(String [] args){
        Stack s= new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
