import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter Age: ");
        Scanner sc = new Scanner(System.in);
        int Age = sc.nextInt();

        if(Age<13){
            System.out.println("Child");
        }else if(Age>=13 & Age<=18){
            System.out.println("Teenager");
        }else if(Age>18 & Age<60){
            System.out.println("Adult");
        }
        else{
            System.out.println("Senior Citizen");
        }

    }
}
