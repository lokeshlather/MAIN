import java.util.*;

public class Main {

    public static void power(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int x = sc.nextInt();
        System.out.print("Enter Power: ");
        int y = sc.nextInt();
        int result=1;
        for(int i=0;i<y;i++){
            result = result * x;
        }
        System.out.print("Power: "+result);
    }

    public static void main(String args[]){
        power();
    }
}
