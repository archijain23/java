public class duplicates {
    public static void removeduplicates(String str,int index,StringBuilder newstr, boolean map[]){
        if(index==str.length()){
            System.out.println(newstr);
            return;
        }
        
        char currchar=str.charAt(index);
        if(map[currchar-'a']==true){
            removeduplicates(str,index+1,newstr,map);
        }
        else{
            map[currchar-'a']=true;
            removeduplicates(str,index+1,newstr.append(currchar),map);
        }

    }
    public static void main(String[] args){
        String str="appnnacollege";
        removeduplicates(str,0,new StringBuilder(""),new boolean[26]);
    }
    
}