import java.util.*;

public class BinaryTreeP1 {
   //creating a tree
   static class Node{
     int data;
     Node left;
     Node right;

     //constructor
     Node( int data){
      this.data=data;
      this.left=null;
      this.right=null;
     }

   } 
   static class BinaryTree{
    static int idx=-1;
    public static Node buildTree(int Node[]){
           idx++;
           if(Node[idx]==-1){
            return null;
           }
           Node newNode=new Node(Node[idx]);
           newNode.left= buildTree(Node);
           newNode.right=buildTree(Node);
          return newNode;
    }

    //preorder code
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    //inorder code
    public static void inorder(Node root){
         if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }

    //postorder code
    public static void postorder(Node root){
         if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    //levelorder code
    public static void levelorder(Node root){
         if(root==null){
            return;
        }

        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);           
                }
                if(currNode.right!=null){
                    q.add(currNode.right);           
                }
            }
        }
    }

    //height of the tree
    public static int height(Node root){
         if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }

    //count of nodes
     public static int count(Node root){
         if(root==null){
            return 0;
        }
        int leftCount=count(root.left);
        int rightCount=count(root.right);
        return leftCount+rightCount+1;
   }

   //sum of nodes
     public static int sum(Node root){
         if(root==null){
            return 0;
        }
        int leftsum=sum(root.left);
        int rightsum=sum(root.right);
        return leftsum+rightsum+root.data;
   }
}
   public static void main(String[] args){
    int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    BinaryTree Tree=new BinaryTree();
    Node root= Tree.buildTree(nodes);
    System.out.println(root.data);
    Tree.preorder(root);
    System.out.println();
    Tree.inorder(root);
    System.out.println();
    Tree.postorder(root);
    System.out.println();
      Tree.levelorder(root);
      System.out.println();
      System.out.println();
      System.out.println(Tree.height(root));
      System.out.println(Tree.count(root));
      System.out.println(Tree.sum(root));
   }
}
