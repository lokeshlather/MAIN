import java.util.*;

public class Main{
    public static void Factorial(int x){
        int factorial = 1;
        if(x<0){
            System.out.println("Invalid Number!");
            return;
        }

        for(int i=x;i>=1;i--){
            factorial = factorial*i;
        }
        System.out.println("Factorial: "+factorial);
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = sc.nextInt();
        Factorial(number);
    }
}
