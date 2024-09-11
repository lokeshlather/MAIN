import java.util.*;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of Columns: ");
        int cols = sc.nextInt();

        int arr[][] = new int[rows][cols];
        System.out.print("Enter Elements of the array: ");
        
        //Inputing Elements
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //Printing Elements
        System.out.println("Array: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Enter the element you want to Search: ");
        int x = sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(x == arr[i][j]){
                    System.out.print(x + " found at " + "[" + i + "]" + "[" + j + "]" + " index");
                }
            }
        }
    }

}
