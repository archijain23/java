import java.util.*;
public class BinaryTreeP2 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
             this.left=null;
             this.right=null;

        }
    }
             //diameter of tree approach 2
           static class Info{
            int diam;
            int ht;
            Info(int diam,int ht){
                this.diam=diam;
                this.ht=ht;
            }
           }
           public static Info diameter(Node root){
            if(root==null){
                return new Info(0,0);
            }

            Info leftInfo=diameter(root.left);
            Info rightInfo=diameter(root.right);
            int diam=Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
            int ht=Math.max(leftInfo.ht,rightInfo.ht)+1;

            return new Info(diam,ht);
           }

           static class Info2{
            Node node;
            int hd;

            Info2(Node node,int hd){
                this.node=node;
                this.hd=hd;
            }
           }

           public static void topView(Node root){
            //level order
            Queue <Info2> q=new LinkedList<>();
            HashMap<Integer,Node> map=new HashMap<>();

            int min=0,max=0;
            q.add(new Info2(root,0));
            q.add(null);
             
            while(!q.isEmpty()){
                Info2 curr=q.remove();
                   if(curr==null){
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                   }else{
                       if(!map.containsKey(curr.hd)){//first time hd is occuring
                       map.put(curr.hd,curr.node);

                      }
                        if(curr.node.left!=null){
                          q.add(new Info2(curr.node.left, curr.hd-1));
                          min=Math.min(min,curr.hd-1);
                         }
                         if(curr.node.right!=null){
                           q.add(new Info2(curr.node.right, curr.hd+1));
                           max=Math.max(max,curr.hd+1);
                           }
                   }
               }
                   

            for(int i=min;i<=max;i++){
                System.out.print(map.get(i).data+" ");
            }

           }
        

    public static void main(String[] args){
        /*       1
         *     /  \
         *    2    3
         *   / \  / \
         *  4  5  6  7
         */

         Node root=new Node(1);
         root.left=new Node(2);
         root.right=new Node(3);
         root.left.left=new Node(4);
         root.left.right=new Node(5);
         root.right.left=new Node(6);
         root.right.right=new Node(6);

        //  System.out.println(diameter(root).diam);
        //   System.out.println(diameter(root).ht);
        topView(root);

    }
}
