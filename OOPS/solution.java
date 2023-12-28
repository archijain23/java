import java.util.*;
class bakers{
private int bakerId;
private String bakersName; 
private char bakerClass;  
private double bakerRating;  
private boolean onlineDelivery;  
public bakers(int bakerId, String bakername,char bakerClass,double bakerRating,boolean onlineDelivery){
this.bakerId=bakerId;
this.bakersName=bakername;
this.bakerClass=bakerClass;
this.bakerRating=bakerRating;
this.onlineDelivery=onlineDelivery;
}
int getbakerId(){
    return this.bakerId;
}
boolean getonlinedelivery(){
    return this.onlineDelivery;
}
char getbakerClass(){
    return this.bakerClass;
}
double getbakerRating(){
    return this.bakerRating;
}
void setbakerRating(double bakerrating){
    this.bakerRating=bakerrating;
    
}
             }


public class solution {
    public static void printarr(bakers arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    static String findDeliveryType( bakers bakerarr[],int value){
        
        for(int i=0;i<bakerarr.length;i++){
            if(bakerarr[i].getbakerId()==value){
                if(bakerarr[i].getonlinedelivery()==true){
                    return "Online Available";
                }
                else{
                    return "Online Not Available";
                }
            }
        }
        return null;
    }
    static bakers[] sortBakersRatingOfClass(bakers bakerarr[],char bakerClass){
      //double key=0.0;
      int j=0;
       bakers temp[]=new bakers[bakerarr.length];
        for(int i=0;i<bakerarr.length;i++){
            if(bakerarr[i].getbakerClass()==bakerClass){
               temp[j].setbakerRating(bakerarr[i].getbakerRating());
            j++;
        }
        }
        Arrays.sort(temp);
return temp;
        }
       
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number of entries:");
        int number=sc.nextInt();
        sc.nextLine();
        bakers bakerarr[]= new bakers[number];
        
        for(int i=0;i<number;i++){
              
           System.out.print("enter id:\n");
              int bakerId=sc.nextInt();
              sc.nextLine();
              System.out.print("enter name:\n");
             String bakername=sc.nextLine();
         System.out.print("enter class:\n");
              char bakerClass=sc.next().charAt(0);
              System.out.print("rating:\n");
              double bakerRating=sc.nextDouble();
             System.out.print("delivery:\n");
              boolean onlineDelivery=sc.nextBoolean();
              bakerarr[i]=new bakers(bakerId,bakername,bakerClass,bakerRating,onlineDelivery);
             }
             System.out.println("enter  your id");
int value =sc.nextInt();
sc.nextLine();
System.out.println("enter baker class");
char bakerclass=sc.next().charAt(0);
             System.out.println(findDeliveryType(bakerarr, value));
             if(findDeliveryType(bakerarr, value)==null){
                System.out.println("There is no Bakers with given Id");
             }
             bakers[] sortedBakers = sortBakersRatingOfClass(bakerarr, bakerclass);
if(sortedBakers.length>0){
    
    printarr(sortedBakers);
}
else{
    System.out.println("Bakers given class is not present");
}

    }
    
}
