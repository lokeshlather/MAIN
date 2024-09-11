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

        System.out.print("Spiral Order: ");
        int rowstart = 0;
        int rowend = rows-1;
        int colstart = 0;
        int colend = cols-1;

        while(rowstart<=rowend && colstart<=colend){

            //Printing Top Row
            for(int col=colstart;col<=colend;col++){
                System.out.print(arr[rowstart][col]+" ");
            }
            rowstart++;

            //Printing Right Column
            for(int row=rowstart;row<=rowend;row++){
                System.out.print(arr[row][colend]+" ");
            }
            colend--;

            //Priting Bottom Row
            for(int col=colend;col>=colstart;col--){
                System.out.print(arr[rowend][col]+" ");
            }
            rowend--;

            //Printing Left Column
            for(int row=rowend;row>=rowstart;row++){
                System.out.print(arr[row][colstart]+" ");
            }
            colstart++;

        }
    }

}
