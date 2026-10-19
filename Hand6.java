import java.util.Scanner;
public class Hand6 {
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        boolean isContinue = true;




        while(isContinue){
            System.out.println("Do you want to continue [1]yes or [2]no");
            isContinue = scn.nextInt() == 1 ? true : false;
            



        }
        System.out.println("thankyouu you for using the calculator!!");
        
        
        

    scn.close();
    }
}






/*
 * while (boolean-exprsn) {
 * statement;
 * }
 * 
 * How many
 * for (invar=1; invar<=10; invar++)
 * {
 * statement
 * }
 * 
 */