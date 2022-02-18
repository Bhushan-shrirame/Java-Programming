import java.util.Scanner;

public class Function {
    
    // public static void printMyName(String name){ 
    //     System.out.println(name);
    //     return; 
    //}
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     String name = sc.nextLine();
    //     printMyName(name); // call iya functon ko

    // }



    public static int calculatesum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int sum = calculatesum(a,b);
        System.out.println("Sum of 2 numbers is : "+sum);

    }
    
    
}
