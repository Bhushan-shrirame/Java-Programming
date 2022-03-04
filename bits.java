import java.util.*;

public class bits {
    
    public static void main(String args[]){

        // GET BIT
        int n = 5;
        int pos = 3;
        int bitMask = 1<<pos;

        if((bitMask & n)==0) {
            System.out.println("bit was zero ");
        }else {
            System.out.println("bit was one");
        }


        //SET BIT
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;

        int newNumber = bitMask | n;
        System.out.println(newNumber);


        //Clear Bit
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;
        int notBitMask = ~(bitMask);

        int newNumber = notBitMask & n;
        System.out.println(newNumber);

        // Update Bit
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();

        int n = 5;
        int pos =1;

        int bitMask = 1<<pos;
        if(pos ==1){
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }else {
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);

        }




        
    }
    
}
