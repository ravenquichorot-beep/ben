import java.util.Scanner;

public class login {
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        String correctUserName = "raven";
        String inputUserName = "";

        int correctPin = 2006;
        int inputPin = 0;

        System.out.println("Enter your user name: ");
        
        inputUserName = scn.nextLine();
        System.out.println("Enter your user pin: ");
        
        inputPin = scn.nextInt();
        

        if(inputUserName.equals(correctUserName) && correctPin == inputPin ){
          System.out.println("your in");

        }

        else{
         System.out.println("your out");
         
        
        }  
        scn.close();

    }
}
