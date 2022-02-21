import java.util.*;

public class Pattern {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        //que.1

        // outer loop
        for(int i =1; i<=n;i++){
               //inner loop
            for(int j = 1; j <=m;j++){
               System.out.print("*");
            }
            System.out.println(); 
        }


        //Que2
        // *****
        // *   *
        // *   *
        // *****


        // int n = 4;
        // int m= 5;

        // //outer loop
        for(int i =1; i<=n; i++){
            //inner loop
            for(int j=1; j<=m; j++){
                //cell -> (i,j)
                if(i==1 || j==1 || i==n || j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }

        //Que3
        // *
        // **
        // *** 
        // ****

        for(int i=1; i<=n; i++){
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        
        //Que4
        // ****
        // ***
        // **
        // *

        for(int i=n; i>=1; i--){
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }

        //Que5
        //     *
        //    **
        //   *** 
        //  ****
        
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop --> Space print
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            //inner loop --> star print
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Que6
        //1
        //12
        //123
        //1234
        //12345
        
        //outer loop
        for(int i =1 ; i<=n; i++){
            //inner loop
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }


        //Que7
        //12345
        //1234
        //123
        //12
        //1

        //outer loop
        for(int i =1 ; i<=n; i++){
            //inner loop
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //Que8
        //1
        //2 3
        //4 5 6
        //7 8 9 10
        //11 12 13 14 15

        
        int number =1;
        //outer loop
        for(int i =1; i<=n;i++){
            //inner loop
            for(int j =1; j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }

        //Que9
        //1
        //0 1
        //1 0 1
        //0 1 0 1
        //1 0 1 0 1

        //outer loop
        for(int i =1; i<=n; i++){
            //inner loop
            for(int j=1;j<=i;j++){
                int sum =i+j;
                if(sum%2==0){ //even
                    System.out.print("1 ");
                }else{ //odd
                    System.out.print("0 ");
                }
            }
            System.out.println();
            
        }


    }
    
}
