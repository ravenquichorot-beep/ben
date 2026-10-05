import java.util.Scanner;

public class calculator {
    public static void main(
        String[] args 
    ){
        Scanner scn = new Scanner(System.in);
         System.out.println("input your first number");
        
         int firstnum = scn.nextInt();
         System.out.println("add your second number");
        
         int secondnum = scn.nextInt();
         System.out.println("choose a + or - or * or /");
        String  operatorinput = scn.next();
        



        if (operatorinput.equals("+")){
            System.out.println(firstnum + secondnum);
        
        }
        else if (operatorinput.equals("-")){
            System.out.println(firstnum - secondnum);
        }
        else if (operatorinput.equals("*")){
            System.out.println(firstnum * secondnum);
        }
        else if (operatorinput.equals("/")){
            System.out.println(firstnum / secondnum);
        }

        else {
            System.out.println("Bokyaaa kaaa boi");
        }

        scn.close();
    }
    
}

// nextInt() for whole numbers
// nextLine() for full text lines
// nextDouble() for decimal numbers
// next() for single words

/*
    0. Import mo: import java.util.Scanner;
    0.1: Gawa ka class
    1. Gawa ka scanner: Scanner scn = new Scanner(System.in);

    2. gamitin si scanner: 
        System.out.println("Input first number");
        int num1 = scn.nextInt();

    3. if else mo lang
        if (condition){
        
        } else if (condition){
            
        } else {
        
        }

    4. Close ang scanner: scn.close();
*/