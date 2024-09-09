import java.util.*;

public class Main {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to Continue or 0 to Exit...");
        int input = sc.nextInt();
        int positives = 0;
        int zeros = 0;
        int negatives = 0;

        while(input==1){
            System.out.print("Enter Number: ");
            int number = sc.nextInt();
            
            if(number>0){
                positives++;
            }else if(number==0){
                zeros++;
            }else{
                negatives++;
            }

            System.out.println("Enter 1 to Continue or 0 to Exit...");
            input = sc.nextInt();
        }
        System.out.println("Positive Numbers Entered: "+positives);
        System.out.println("Negative Numbers Entered: "+negatives);
        System.out.println("Zeros Entered: "+zeros);

        
    }
}
