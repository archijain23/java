// implementation of stack through arraylist
import java.util.ArrayList;

public class StackA {
    static class Stack{
        static ArrayList<Integer>List=new ArrayList<>();
    
        //function to check stack is empty or not
        public static boolean  isEmpty(){
            return List.size()==0;
        }

        //push operation
        public static void push(int data){
            List.add(data);
        }

        //pop operation
        public static int pop(){
            if(isEmpty()){
                  return -1;
            }
            int top=List.get(List.size()-1);
            List.remove(List.size()-1);
            return top;
        }

        //peek operation
    public static int peek(){
        if(isEmpty()){
                  return -1;
            }
        int top=List.get(List.size()-1);
            return top;  
    }

  
} 
  public static void main(String args[]){
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();


        }
    }

    
}
