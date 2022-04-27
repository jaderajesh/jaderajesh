import java.util.*;
public class Sort {
    public static void main(String[] args) {
        System.out.println("Enter how many of numbers are giving: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter "+i+" String:");
            arr[i]=sc.nextInt();
        }
        int temp;
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        for(int i=1;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
