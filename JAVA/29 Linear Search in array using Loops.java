import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();
        System.out.print("Enter the Elements of the Array: ");
        int arr[]= new int[size];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Array: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        System.out.print("Enter Number you want to Search: ");
        int x = sc.nextInt();

        for(int i=0;i<size;i++){
            if(arr[i]==x){
                System.out.print(x+" found at " + i + " index");
            }
        }
    }
}
