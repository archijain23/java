import java.util.*;
public class BST2 {
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

    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
      //creating balanced BST
      public static Node createBST(int arr[],int st, int end){
           if(st>end){
             return null;
             }
             int mid=(st+end)/2;
             Node root=new Node(arr[mid]);
             root.left=createBST(arr,st,mid-1);
             root.right=createBST(arr,mid+1,end);

             return root;
      }

      //to get inorder list 
      public static void getInorder(Node root,ArrayList<Integer> inorder){
        if(root==null){
            return;
        }

        getInorder(root.left,inorder);
        inorder.add(root.data);
        getInorder(root.right,inorder);
      }
      //to create bst
      public static Node createBST2(ArrayList<Integer> inorder,int st,int end){
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        Node root=new Node(inorder.get(mid));
         root.left=createBST2(inorder,st,mid-1);
        
        root.right=createBST2(inorder,mid+1,end);
       return root;
      }

      public static Node balancedBST(Node root){
        //inorder seq
        ArrayList<Integer> inorder=new ArrayList<>();
        getInorder(root,inorder);

        //sorted inorder->balanced BST

        root=createBST2(inorder,0,inorder.size()-1);
        return root;
      }
    public static void main(String args[]){
    //    int arr[]={3,5,6,8,10,11,12};

       // Node root= createBST(arr,0,arr.length-1);
       

        Node root=new Node(8);
        root.left=new Node(6);
        root.left.left=new Node(5);
          root.left.left.left=new Node(3);

           root.right=new Node(10);
            root.right.right=new Node(11);
            root.right.right.right=new Node(12);
             preorder(root);
             System.out.println();
            root= balancedBST(root);
              preorder(root);

    }

    
}
