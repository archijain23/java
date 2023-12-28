import java.util.*;

public class startsWith {
    static class node{
        node children[]=new node[26];
        boolean eow=false;

        node(){
            for(int i=0;i<children.length;i++){
                children[i]=null;
            }
        }
    }
    public static node root=new node();

    public static void insert(String word){
       node curr=root;
       for(int level=0;level<word.length();level++){
            int idx=word.charAt(level)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new node();
            }
            curr=curr.children[idx];
       }
       curr.eow=true;
    }
    public static boolean search(String key){
        node curr=root;
        for(int level=0;level<key.length();level++){
            int idx=key.charAt(level)-'a';
           if(curr.children[idx]==null){
            return false;
           }
           curr=curr.children[idx];
        }
            return curr.eow==true;
    }

    public static boolean startswith(String prefix){
        node curr=root;

        for(int i=0;i<prefix.length();i++){
            int idx=prefix.charAt(i)-'a';

            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        return true;
    }
   

    public static void main(String args[]){
        String words[]={"apple","app","mango","man","woman"};
        String prefix1="app";
        String prefix2="moon";

        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }

        System.out.println(startswith(prefix1));
        System.out.println(startswith(prefix2));
    }
}
