import java.util.*;

public class Strings {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //String Declaration
        // String name = "Tony";
        // String fullname = "Tony Stark";
        // String sentence = "My name is tony stark";

        // String name =sc.nextLine();
        // System.out.println("Your name is : "+ name);


        // Concatenation
        String firstName = "Tony";
        String lastName = "Stark";
        String fullName = firstName + " " +lastName;
        System.out.println(fullName);
        System.out.println(fullName.length());
        
        //charAt
        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }

    } 
    
}
