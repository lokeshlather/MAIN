//Program to print the sum of Two Numbers input by user using functions in JAVA

import java.util.*;

public class SumFn {
    public static int Sum(int a, int b){
        int sum=a+b;
        return sum;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int x = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int y = sc.nextInt();
        System.out.print("Sum: "+Sum(x,y));
    }
}
