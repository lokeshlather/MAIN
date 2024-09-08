import java.util.*;
public class Main {
    public static int Product(int x, int y){
        int p=x*y;
        return p;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        System.out.print("Product: "+Product(a,b));
    }
}
