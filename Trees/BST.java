import java.util.*;
public class BST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }
        //insert function
    public static Node insert(Node root,int val){
        if(root==null){
         root =new Node(val);
         return root;
        }

        if(root.data>val){
          root.left=  insert(root.left,val);
        }else{
          root.right=  insert(root.right,val);
        }
        return root;
    }

    //search in BST
     public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data>key){
          
            return search(root.left,key);
        }
        if(root.data<key){
            return search(root.right,key);
        }
        else {
            return true;
        }
     }
        //inorder printing
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }
     //delete a node->3 cases
     public static Node delete(Node root,int val){
        //search val
        if(root.data<val){
            root.right=delete(root.right,val);
        }else if(root.data>val){
            root.left=delete(root.left,val);
        }
        else{//voila->delete
             //case 1->no child
             if(root.left==null && root.right==null){
                return null;
             }
             //case2->single child
              if(root.left==null){
                return root.right;
             }else if(root.right==null){
                return root.left;
             }

             Node IS=findInorderSuccessor(root.right);
             root.data=IS.data;
             root.right=delete(root.right,IS.data);
        }
        return root;
     }

     public static Node findInorderSuccessor(Node root){
               while(root.left!=null){
                root=root.left;
               }
               return root;
     }

     //print in range
     public static void printInrange(Node root,int k1,int k2){
            if(root==null){
                return;
            }
            if(root.data>=k1 && root.data<=k2){
              printInrange(root.left,k1,k2);
              System.out.print(root.data+" ");
              printInrange(root.right,k1,k2);
            }else if(root.data<k1){
                printInrange(root.right,k1,k2);
            }else{
                printInrange(root.left,k1,k2);
            }
     }

     //root to leaf path
     public static void printroot2leaf(Node root,ArrayList<Integer> path){
            if(root==null){
                return;
            }
            path.add(root.data);
            if(root.left==null && root.right==null){
                printpath(path);
            }
            printroot2leaf(root.left,path);
            printroot2leaf(root.right,path);
            path.remove(path.size()-1);
     }

     //function to print path
     public static void printpath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("null");
     }

     //validate bst
     public static boolean isvalidBST(Node root,Node min,Node max){
        if(root==null){
            return true;
        }
        if(min!=null && root.data<=min.data){
            return false;
        }
        else if(max!=null && root.data>=max.data){
            return false;
        }
        return isvalidBST(root.left,min,root) && isvalidBST(root.right,root,max);

     }
     
     
     //mirror of a BST

     public static Node createmirror(Node root){
        if(root==null){
            return null;
        }
    Node leftmirror=createmirror(root.left);
    Node rightmirror=createmirror(root.right);

    root.left=rightmirror;
    root.right=leftmirror;
    return root;
     }
    public static void main(String args[]){
        int values[]={8,5,3,6,10,11,14};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }

        inorder(root);
        System.out.println();

        // if(search(root,4)){
        //     System.out.println("found");
        // }else{
        //     System.out.println("not found");
        // }

    //     root=delete(root,1);
    //     System.out.println();
    //   inorder(root);

        // int k1=5,k2=12;
        //   printInrange(root,k1,k2);

       // printroot2leaf(root,new ArrayList<>());

    //    if(isvalidBST(root,null,null)){
    //         System.out.println("is valid");
    //     }else{
    //         System.out.println("not valid");
    //     }
    createmirror(root);
    inorder(root);
    }
}
