import java.util.*;
class emp{
    int id;
    String name;
    emp(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter name:");
    name=sc.next();
    System.out.println("Enter ID:");
    id=sc.nextInt();
    }   
}
class Clerk extends emp{
    void show(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Designation: Clerk");
    }
} 
class Developer extends emp{
    void show(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Designation: Developer");
    }
} 
class Tester extends emp{
    void show(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Designation: Tester");
    }
} 
class Manage extends emp{
    void show(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Designation: Manager");
    }
} 


class Demo1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Clerk c=null;
        Developer d=null;
        Tester t=null;
        Manage m=null;
            System.out.println("1) Create ");
            System.out.println("2) Display ");
            System.out.println("Enter the choice:");
            int ch=sc.nextInt();
            if(ch==1){
                System.out.println("============================");
                System.out.println("1) Clerk");
                System.out.println("2) Developer");
                System.out.println("3) Tester ");
                System.out.println("4) Manager");
                System.out.println("Enter the choice:");
                int ch2=sc.nextInt();
                System.out.println("=======================");
                if(ch2==1){
                    System.out.println("Clerk information:");
                    c=new Clerk();
                    System.out.println("--------------------");
                    c.show();
                }
                 else if(ch2==2){        
                    d=new Developer();
                    System.out.println("--------------------");
                    System.out.println("Developer information:");
                    d.show();
                }
                else if(ch2==3){
                    System.out.println("Tester information:");
                    t=new Tester();
                    System.out.println("--------------------");
                    t.show();
                }
                else if(ch2==4){
                    System.out.println("Manager information:");
                    m=new Manage();
                    System.out.println("--------------------");
                    m.show();
                }
            }
    }
}