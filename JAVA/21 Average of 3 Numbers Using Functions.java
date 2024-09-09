import java.util.*;

public class Main {
    public static void Average(int x, int y, int z){
        int avg = (x+y+z)/3;
        System.out.print("Average: "+avg);
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number :");
        int a = sc.nextInt();
        System.out.print("Enter second Number :");
        int b = sc.nextInt();
        System.out.print("Enter third Number :");
        int c = sc.nextInt();
        Average(a,b,c);
    }
}
