import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        System.out.print("Enter Age: ");
        Scanner sc = new Scanner(System.in);
        int Age = sc.nextInt();
        if(Age>18){
            System.out.println("Adult");
        }else{
            System.out.println("Not Adult");
        }

    }
}
