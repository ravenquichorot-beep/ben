import java.util.Scanner;
public class BmiCalculator {
    public static void main(String[] args){
        
        // declare variables
        Scanner scn = new Scanner(System.in);   
        
        double weight = 0; // in (kg)
        double height = 0; // in (m)
        double bmi = 0;


        System.out.println("INPUT YOUR WEIGHT IN KG:");
        weight = scn.nextDouble();

        System.out.println("INPUT YOU HEIGHT IN METERS:");
        height = scn.nextDouble();


        bmi = weight / (height * height);

        System.out.println("=====BMI REPORT=====");
        System.out.println("weight: " + weight + " kg");
        System.out.println("height: " + height + " meters");
        System.out.println("BMI: " + bmi);
        

        if(bmi >= 30.0){

            System.out.println("Obese");
        }
        
        else if (bmi >= 25.0 && bmi <= 29.9){
            System.out.println("Overweight");

        }
        else if (bmi >= 18.5 && bmi <=24.9 ){
            System.out.println("Normal");
        }
        else{
            System.out.println("Underweight");
        }
        
        String advice = (bmi >= 18.5 && bmi <= 24.9) ? "KEEP IT UP" : "SEE A DOCTOR";
        System.out.println("Advice: " + advice);

        scn.close();

    }
}



    


/*## **2. BMI Calculator**
- Input Weight (kg) and Height (m)
- Calculates the following:
  - BMI (use formula: `BMI = Weight / (Height * Height)`)
  - Category (use IF ELSE)
    - Below 18.5 → "Underweight"
    - 18.5–24.9 → "Normal"
    - 25.0–29.9 → "Overweight"
    - 30.0 and above → "Obese"
  - Health Advice (USE Conditional Operator)
    - If BMI is 18.5–24.9 → "KEEP IT UP". Otherwise → "SEE A DOCTOR"

**Expected Output:**
```
--- BMI Report ---
Weight  : 70.0
Height  : 1.75
BMI     : 22.86
Category: Normal
Advice */