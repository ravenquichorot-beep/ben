import java.util.Scanner;

public class FoodBillCalculator {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        String Name = "";
        double fBill = 0;
        double sCharge = 0;
        double vatPercentage = 0.12;
        double scPercentage = 0.10;

        double subtotal = 0;
        double vat = 0;
        double total = 0;

        //(a > b) ? a : b;
        String category = ""; // ternary operator
        
        
        System.out.println("Input customer name: ");
        Name = scn.nextLine();
        
        System.out.println("Input Food bill: ");
        fBill = scn.nextDouble();

        sCharge = fBill * scPercentage;
        subtotal = fBill + sCharge;
        vat = subtotal * vatPercentage;
        total = vat + subtotal;

        category = (total>= 3000) ? "EXPENSIVE" : "AFFORDABLE"; // ternary operator

        System.out.println("====== Restaurant bill======");
        System.out.println("Customer name: " + Name);
        System.out.println("Foodbill: " + fBill);
        System.out.println("Service Charge: " + sCharge );
        System.out.println("Subtotal: " + scPercentage);
        System.out.println("VAT(12%): " + vatPercentage);
        System.out.println("Total bill: " + total);
        System.out.println("Category: "+ category);
        


        scn.close();
    }
    
}


/*
        input customer name, food bill
        calculate the following:
        service charge = food bill * 10%
        subtotal (Food billd + service charge)
        VAT (PHILIPPINES STANDARD RATE: 12%)
        TOTAL BILL (SUBTOTAL + VAT)
        BILL CATEGORY(USE CONDITIONAL OPERATOR)
        if total bill is 3000 or more "EXPENSIVE". otherwise "AFFORDABLE"

        EXPECTED OUTPUT 
        customer: juan 
        Food Bill: 1500.0
        service charge: 150.0
        subtotal: 1650.0
        vat(12%): 198.0
        total bill: 1848.0
        category: affordable 

        */