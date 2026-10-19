import java.util.Scanner;
public class gradeCaluculator { 

    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        //input variables
        int inputPin = 0;
        int correctPin = 2006;
        double sub1 = 0;
        double sub2 = 0;
        double sub3 = 0;
        double sub4 = 0;
        double sub5 = 0;
        
        //variables for computation
        double total = 0;
        double average = 0;
        String grade = "";
        String remarks = "";
        
        System.out.println("Enter your pin :  ");
        inputPin = scn.nextInt();

        if(inputPin != correctPin){
            System.out.println("Invalid pin");
           scn.close();
            return;
        }
        
        

        System.out.println("Input grade of 1st subject");
        sub1 = scn.nextDouble();
        
        System.out.println("Input grade of 2nd subject");
        sub2 = scn.nextDouble();
        
        System.out.println("Input grade of 3rd subject");
        sub3 = scn.nextDouble();
        
        System.out.println("Input grade of 4th subject");
        sub4 = scn.nextDouble();
        
        System.out.println("Input grade of 5th subject");
        sub5 = scn.nextDouble();

        total = sub1 + sub2 + sub3 + sub4 + sub5;

        average = total / 5;

        if(average >= 90 && average <= 100){
            grade = "A";
        }
        else if (average >= 80 && average <= 89){
            grade = "B";
        }
        else if (average >= 70 && average <= 79){
            grade = "C";
        }
        else if (average >= 60 && average <= 79){
            grade = "D";
        }
        else{
            grade = "F";
        }

        remarks = (average <= 59) ? "FAILED " : "PASSED";
        System.out.println("---Result---");
        System.out.println("Total : " + total);
        System.out.println("Average : " + average);
        System.out.println("Letter : " + grade);
        System.out.println("Remarks : " + remarks);
        



        
        scn.close();
    }
    
}


/*
Input Grades for 5 Subjects
- Calculates the following:
  - Total
  - Average
  - Letter (use IF ELSE)
    - 90–100 → A
    - 80–89 → B
    - 70–79 → C
    - 60–69 → D
    - Below 60 → F
  - Remarks (USE Ternary Operator)
    - Less than 60 "FAILED". Otherwise "PASSED



    --- Results ---
Total  : 260.0
Average: 52.0
Letter : F
Remark : FAILED
*/