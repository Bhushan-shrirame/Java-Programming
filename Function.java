import java.util.Scanner;

public class Function {
    
    public static void printMyName(String name){ 
        System.out.println(name);
        return; 
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        printMyName(name); // call iya functon ko

    }



    public static int calculatesum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int sum = calculatesum(a,b);
        System.out.println("Sum of 2 numbers is : "+ sum);

    }


    // for product of 2 number 

    public static int calculatemultiply(int a, int b){
        return a*b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("multiply of 2 numbers is : "+ calculatemultiply(a,b));

    }

    //Factorial
    public static void Factorial(int n ){
        //loop
        if(n<0){
            System.out.println("Invalid Number");
            return;
        }
        int factorial =1;
        for(int i = n; i>=1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }

    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        
        Factorial(n);

    }


    
    
}
