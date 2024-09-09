import java.util.*;

public class Main {
    public static void SumOdd(int x){
        int a=0;
        for(int i=1;i<=x;i++){
            if(i%2==1){
                a=a+i;
            }else{
                continue;
            }
        }
        System.out.print("Sum of Odd Numbers: "+a);
    }    

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        SumOdd(n);
    }
}
