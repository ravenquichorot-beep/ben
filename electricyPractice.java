import java.util.*;
public class electricyPractice {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        
        // variables

        String name = "";
        double previousReading = 0;
        double currentReading = 0;

        // the variables for computation total

        double totalConsumption = 0;
        double totalBill = 0;

        //fixed rate 
        double electricRate = 1.25;

        System.out.println("=== Electricity Bill Calculator ===");
       
        System.out.print("Enter customer name: ");
        name = scn.nextLine();

        System.out.print("Enter previous reading: ");
        previousReading = scn.nextDouble();

        System.out.print("Enter current reading: ");
        currentReading = scn.nextDouble();


        // computation
        totalConsumption = currentReading - previousReading;
        totalBill = totalConsumption * electricRate;


        System.out.println("--- Electric Bill ---");
        System.out.println("Customer: " + name);
        System.out.println("Consumption: " + totalConsumption);
        System.out.println("Total Bill: " + totalBill);


        scn.close();
    }
}
/*
=== Electricity Bill Calculator ===
Enter customer name: Pedro
Enter previous reading: 1200
Enter current reading: 1450
Enter rate per kWh: 12.5

--- Electric Bill ---
Customer:      Pedro
Consumption:   250 kWh
Total Bill:    3125.00
*/