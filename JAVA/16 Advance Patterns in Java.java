public class Main {
    public static void main(String args[]){

        //Butterfly Pattern
        System.out.println("Butterfly");
        //UpperHalf
        for(int i=1;i<=4;i++){
            //LeftPart
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //Spaces
            int s=2*(4-i);
            for(int j=1;j<=s;j++){
                System.out.print(" ");
            }
            //RightPart
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //LowerHalf
        for(int i=4;i>=1;i--){
            //LeftPart
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //Spaces
            int s=2*(4-i);
            for(int j=1;j<=s;j++){
                System.out.print(" ");
            }
            //RightPart
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        //Solid Rhombus
        System.out.println("Solid Rhombus");
        for(int i=1;i<=5;i++){

            //Spaces
            int s=(5-i);
            for(int j=1;j<=s;j++){
                System.out.print(" ");
            }
            
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println();
        //NumberPyramid
        System.out.println("Number Pyramid");

        for(int i=1;i<=5;i++){
            //Spaces
            int s=(5-i);
            for(int j=1;j<=s;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();

        
        }

        System.out.println();
        System.out.println();
        //Palindromic Pattern
        System.out.println("Palindromic Pattern");
        for(int i=1;i<=5;i++){
            //Space
            int s=(5-i);
            for(int j=1;j<=s;j++){
                System.out.print(" ");
            }
            //Left Part
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //Right Part
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();
        //Diamond
        System.out.println("Diamond");
        //First Part
        for(int i=1;i<=4;i++){
            //Space
            int s=(4-i);
            for(int j=1;j<=s;j++){
                System.out.print(" ");
            }
            //Left Part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //Right Part
            for(int j=i;j>=2;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        //Second Part
        for(int i=4;i>=1;i--){
            //Space
            int s=(4-i);
            for(int j=1;j<=s;j++){
                System.out.print(" ");
            }
            //Left Part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //Right Part
            for(int j=i;j>=2;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
