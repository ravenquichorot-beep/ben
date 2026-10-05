import java.util.Scanner;

    public class convert{
        public static void main(String[] args){

            Scanner scn = new Scanner(System.in);
             System.out.println("Temperature converter"); 
                System.out.println("1. Fahrenheight to Celsius");
                  System.out.println("2. Celsius to Fahrenheight");
                    System.out.println("choose option (1 or 2):");
             // yan yung input for choice
             int choice = scn.nextInt();
             System.out.println("Fahrenheight");
             
             
             if (choice == 1){
                System.out.println("input your Fahrenheight");
                Double F_input = scn.nextDouble();
                System.out.println((F_input  - 32) * 5.0 / 9.0);
                System.out.println("this is your f - c ");
             }
            
            
             else if (choice == 2){
              System.out.println("input your Celsius");
              Double C_input = scn.nextDouble();
              System.out.println((C_input * 9.0 / 5.0) + 32);
              System.out.println("this is your c - f ");




             }


scn.close();

        }
    }
//
/*
READ length
READ width
READ height
SET volume to 0
COMPUTE volume as length * width * height
PRINT volume
F = (celsius * 9.0 / 5.0) + 32

C = (fahrenheit - 32) * 5.0 / 9.0



psuedo code
 1. START
 2. READ CHOICE the F and C
 3. SET CHOICE and value
 4. COMPUTE F to C or C to F 
 5.PRINT  answer
 6. END 

*/