import java.util.*;

class Conditions {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    
        // if else
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b){
            System.out.println("a is equal to b");
        }else{
            if(a > b){
                System.out.println("a is greater than b");
            }else{
                System.out.println("b is greater than a");
            }
            
        }


        // else if

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b){
            System.out.println("a is equal to b");
        }else if(a > b){
            System.out.println("a is greater than b");
        }    
        else{
            System.out.println("b is greater than a");
        }

        // switch
        
        int button = sc.nextInt();
        switch(button){
            case 1: System.out.println("hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("bonjure");
            break;
            default : System.out.println("Invalid button");
        }
    } 
    
}
