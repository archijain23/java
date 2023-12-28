
public class basic {
    public static void main(String[] args){
Student S1=new Student();
S1.roll=124;

Student S2 =new Student();
S2.roll=123;
// System.out.println(S1.roll);
// System.out.println(S2.roll);
    }
}
class Student{
    int roll;
    String name;
    Student(){
        System.out.println("good");
    }
    Student(int roll){
this.roll=roll;
    }
}
