import java.util.*;

class Loop {
    public static void main(String  arg[]){
        // counter++ => counter = counter + 1
    //    for(int counter = 0; counter < 3; counter = counter + 1){
    //         System.out.println("Hello World");
    //     }
        // for(int i =0; i<10; i++){
        //     System.out.println(i);
        // }

        // // while loop
        // int i = 0;
        // while(i<11){
        //     System.out.println(i);
        //     i = i + 1 ; // OR i++
        // }


        // // do while loop
        // int i = 0;
        // do{
        //     System.out.println(i);
        //     i = i +1;
        // }while(i<11);

        // print the sum of first n natural number 

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum =0;
        // for(int i=1;i <= n;i++ ){
        //     sum = sum +i;
            
        // }
        // System.out.println(sum);

        // print the table of a number input by the user
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<11; i++){

            System.out.println(n*i);
        }




               
    } 
}
