import java.util.*;
public class DiceJack{
    public static void main(String[] args) {
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();
        Scanner sc= new Scanner(System.in);
        System.out.println("ENter three numbers between 1 and 6: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();

        System.out.println(roll1);
        System.out.println(roll2);
        System.out.println(roll3);

    }
    public static int rollDice(){
        double randomNumber = (Math.random()*6)+1;
        return (int)randomNumber;
    }
}