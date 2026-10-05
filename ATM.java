import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        // declare variables
        Scanner scn = new Scanner(System.in);

        double balance = 0;
        double depositAmount = 0;
        double withdrawAmount = 0;
        int atmOption = 0;

        System.out.println("Would you like to continue using the ATM?: [1]Yes [2]No");
        int isContinue = scn.nextInt();

        while (isContinue == 1) {
            System.out.println("---- Java ATM Machine ----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            atmOption = scn.nextInt();
            switch (atmOption) {
                case 1:
                    System.out.println("your balance is: " + balance);
                    break; 
                case 2:
                    System.out.println("Enter how much would you like to deposit: ");
                    depositAmount = scn.nextDouble();
                    System.out.println("you have deposited: " + depositAmount);
                    
                    balance = balance + depositAmount;
                    System.out.println("your balance is now: " + balance);
                    break;

                case 3:
                    System.out.println("Enter how much would you like to withdraw: ");
                    withdrawAmount = scn.nextDouble();
                    System.out.println("You have withdrawn:" + withdrawAmount );
                    balance = balance - withdrawAmount;
                    System.out.println("your balance is now:" + balance );
                    break;

                default:
                    isContinue = 2;
                    break;

            }

        }
        scn.close();

    }
}

/*
 * 
 * while (expression) {
 * 
 * 
 * }
 * switch (atmOption) {
 * case 1:
 * System.out.println("Check Balance | In Progress");
 * break;
 * 
 * default:
 * isContinue = 2;
 * break;
 * }
 */
/*
deposit 
read deposit ammount
your balance + deposit ammount
you have deposited -

*/

