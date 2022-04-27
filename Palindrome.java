import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String:");
        String ch=sc.next();
        String str="";
        char ch1;
        for (int i=0;i<ch.length();i++){
            ch1=ch.charAt(i);
            str=ch1+str;
        }
        System.out.println(str);
        if(ch.equals(str)){
            System.out.println("Given string is Palindrome");
        }
        else{
            System.out.println("Given string is not a Palindrome");
        }
    }
}
