public class Main {
    public static void main(String args[]){

        //Solid Rectangle
        System.out.println("Solid Rectangle");
        for(int i=0;i<5;i++){
            for(int j=0;j<8;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        //Hollow Rectangle
        System.out.println("Hollow Rectangle");
        for(int i=1; i<=4;i++){
            for(int j=1;j<=5;j++){
                if(i==1 || i==4 || j==1 || j==5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        //Half Pyramid
        System.out.println("Half Pyramid");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        //Inverted Half Pyramid
        System.out.println("Inverted Half Pyramid");
        for(int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        //Half Pyramid - 180"
        System.out.println("Half Pyramid - 180Degree");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();


        //Half Pyramid with Numbers
        System.out.println("Half Pyramid with Numbers");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        //Inverted Half Pyramid with Numbers
        System.out.println("Inverted half Pyramid with Numbers");
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        //Flyod's Triangle
        System.out.println("Floyd's Triangle");
        int n=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        
        //0-1 Triangle
        System.out.println("0-1 Triangle");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
