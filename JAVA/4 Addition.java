import java.util.*;

public class Main {
    public static void main(String args[]){
        //Input First Number    
        System.out.print("Enter First Number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        //Input Second Number
        System.out.print("Enter Second Number: ");
        // Scanner tc = new Scanner(System.in);
        int b = sc.nextInt();

        int sum=a+b;
        System.out.print("Sum of a and b is: ");
        System.out.println(sum);
    }
}
