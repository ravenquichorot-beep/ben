import java.util.Scanner;

public class calculatorReview {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int firstNum = 0;
        int secNum = 0;
        int choice = 0;


        System.out.println("Choose an Operation: [1] Addition [2] Subtraction [3] Multiply");

        choice = scn.nextInt();

        System.out.println("input 1st number");

        firstNum = scn.nextInt();

        System.out.println("input 2nd number");

        secNum = scn.nextInt();

        if (choice == 1) {
            System.out.println("Addition");
            System.out.println("the sum is " + (firstNum + secNum));
        }

        else if (choice == 2) {
            System.out.println("Subtraction");
        System.out.println("the difference is" + (firstNum - secNum));
        }

        else if (choice == 3){
            System.out.println("Multiplication");
            System.out.println("The product is " + (firstNum * secNum));
        }
    

        else {
            System.out.println("Invalid choice");
        }

        

        scn.close();

    }
}

// pseudocode
/*
 * start
 * input choices + -
 * decision
 * int = 1 (+) int = 2 (-)
 * default = invalid choice
 * 2 num , display input 1st num display 2nd num
 * display sum or difference
 * end
 * 
 */