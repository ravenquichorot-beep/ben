import java.util.Scanner;

public class caculatorswitch {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        boolean isContinue = true;
        float inputNum1 = 0, inputNum2 = 0;
        float answer = 0;
        int option = 0;


        while (isContinue) {
            System.out.println("input the 1st number and 2nd number.");
            inputNum1 = scn.nextFloat();
            inputNum2 = scn.nextFloat();

            System.out.println("Choose an Operation: [1] Addition [2] Subtraction [3] Multiply [4] Divide");
            option = scn.nextInt();
            
            switch (option) {
                case 1:
                    answer = inputNum1 + inputNum2;

                    System.out.println("Result: " + inputNum1 + " + " + inputNum2 + " = " + answer);
                    break;

                case 2:
                    answer = inputNum1 - inputNum2;
                    System.out.println("Result: " + inputNum1 + " - " + inputNum2 + " = " + answer);
                    break;

                case 3:
                    answer = inputNum1 * inputNum2;
                    System.out.println("Result: " + inputNum1 + " * " + inputNum2 + " = " + answer);
                    break;

                case 4:
                    answer = inputNum1 / inputNum2;
                    System.out.println("Result: " + inputNum1 + " / " + inputNum2 + " = " + answer);
                    break;

                default:
                    System.out.println("invalid input");
            }

            System.out.println("Do you want to continue using the calculator ?  [1]yes or [2]no");
            isContinue = scn.nextInt() == 1 ? true : false;
        }
        System.out.println("thank you for using the calculator :) ");

        scn.close();
    }

}
