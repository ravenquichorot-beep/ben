import java.util.Scanner;

public class hand4{

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        
        System.out.println("Input your pin: ");
        int usersPin = scn.nextInt();
        int correctPin = 1234;

        if (correctPin == usersPin){
            System.out.println("Correct");
        }
        else {
            System.out.println("Maliii");

        }


        scn.close();
    }
}




/*
- Age must be greater than or equal to 18.
- PIN must be correct.
*/