import java.util.*;

public class Main {

    public static void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        if(a>b){
            System.out.print("Greater Number: "+a);
        }else{
            System.out.print("Greater Number: "+b);
        }

    }
    public static void main(String args[]){
        Input();
    }
}
