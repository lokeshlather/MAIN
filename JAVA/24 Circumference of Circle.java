import java.util.*;

public class Main {

    public static void Circumference(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double r = sc.nextInt();
        double c = 2*3.14*r;
        System.out.print("Circumference of circle: "+c);
    }

    public static void main(String args[]){
        Circumference();
    }
}
