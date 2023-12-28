import java.util.*;


public class BinaryTreeP3 {
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

   public static void klevel(Node root,int level,int k){
    if(root==null){
        return;
    }
    if(level==k){
        System.out.print(root.data+" ");
        return;
    }

    klevel(root.left,level+1,k);
    klevel(root.right,level+1,k);
   }

   public static Node LCA2(Node root,int n1,int n2){
          if(root==null || root.data==n1 ||root.data==n2){
            return root;
          } 
          Node leftLca= LCA2(root.left,n1,n2);
          Node rightLca= LCA2(root.right,n1,n2);

          //if right return null
          if(rightLca==null){
            return leftLca;
          }
          if(leftLca==null){
            return rightLca;
          }

          return root;
   }
     
   public static int LcaDist(Node root,int n){
    if(root==null){
        return -1;
    }
    if(root.data==n){
        return 0;
    }

    int leftDist=LcaDist(root.left ,n);
    int rightDist=LcaDist(root.right,n);

    if(leftDist==-1 && rightDist==-1){
        return -1;
    }else if(leftDist==-1){
        return rightDist+1;
    }else{
        return leftDist+1;
    }
   }
   //minimum distance between two nodes
   public static int minDist(Node root,int n1,int n2){
    Node lca=LCA2(root,n1,n2);
    int Dist1=LcaDist(lca,n1);
    int Dist2=LcaDist(lca,n2);

    return Dist1+Dist2;
   }

   //kth ancestor
   public static int kancestor(Node root,int n,int k){
    if(root==null){
        return -1;
    }
    if(root.data==n){
        return 0;
    }
    int leftDist=kancestor(root.left,n,k);
    int rightDist=kancestor(root.right,n,k);

    if(leftDist==-1 && rightDist==-1){
        return -1;
    }
    int max=Math.max(leftDist,rightDist);
    if((max+1)==k){
        System.out.println(root.data);
    }
    return max+1;
   }


   //transform to sum tree
   public static int transform(Node root){
    if(root==null){
        return 0;
    }

    int leftchild=transform(root.left);
    int rightchild=transform(root.right);
    int data=root.data;
    int newleft=root.left==null?0:root.left.data;
    int newright=root.right==null?0:root.right.data;

    root.data=newleft+leftchild+newright+rightchild;
    return data;

   }

   //preorder funtion to print tree
    public static void preorder(Node root){
        if(root==null){
            return ;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
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
         root.right.right=new Node(7);

         int k=2;int n=6;
        //  klevel(root,1,k);
        // int n1=4;int n2=6;
        // System.out.println(LCA2(root,n1,n2).data);
          // System.out.println(minDist(root,n1,n2));
         // kancestor(root,n,k);
         transform(root);
         preorder(root);
        }
}
