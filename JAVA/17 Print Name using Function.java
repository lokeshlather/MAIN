import java.util.*;

public class Main {
    public static void Name(String n){
        System.out.print("Your Name: "+n);
        return;
    }
    
    public static void main(String args[]){
        System.out.print("Enter Name: ");
        Scanner sc = new Scanner(System.in);
        String n=sc.nextLine();
        Name(n);
    }
}
