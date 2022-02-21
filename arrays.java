import java.util.*;

public class arrays {

    public static void main (String args[]){

        // int[] marks = new int[3];
        //OR
    //     int marks[] = new int[3];
    //     marks[0] = 97; //phy
    //     marks[1] = 98; //chem
    //     marks[2] = 95; //eng
    //     // System.out.println(marks[0]);
    //     // System.out.println(marks[1]);
    //     // System.out.println(marks[2]);

    //     for(int i =0; i<3; i++){
    //         System.out.println(marks[i]);
    //     }


    // OR

        // int marks[] ={97,98,95};
        // for(int i =0; i<3; i++){
        //     System.out.println(marks[i]);
        // }

        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int numbers[] = new int[size];

        // //input
        // for(int i=0;i<size; i++){
        //     numbers[i] = sc.nextInt();
        // }
        
        // //output
        // for(int i=0; i<size;i++){
        //     System.out.println(size);
        // }
        
    

        //Que Take an array as input from the user.Search for a
        //given number x and print the index at which it occurs

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        for(int i=0;i<size; i++){
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        //output
        for(int i=0; i<size;i++){
            if(numbers[i]==x){
                System.out.println("x found at index: " + i);

            }
        }

    }   
}
