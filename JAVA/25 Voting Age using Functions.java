import java.util.*;

public class Main {

    public static void vote(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.print("You can Vote!");
        }else{
            System.out.print("Not Eligible to Vote!");
        }
    }

    public static void main(String args[]){
        vote();    
    }
    
}
