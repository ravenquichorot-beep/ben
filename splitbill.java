import java.util.Scanner;

public class splitbill {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);


        // fixed
        double vat = 0.12;
        double serviceCharge = 0.10;
       
       
        // userinput 
        int numberOfPeople = 0;
       
        // expected output
        double billAmount = 0;
        double totalComputation = 0;
        double vatComputation = 0;
        double scComputition = 0;
        double billPerPerson = 0;


        System.out.println("=== Restaurant Bill Splitter ===");

        System.out.print("Enter the number of people: ");
        numberOfPeople = scn.nextInt();

        System.out.print("Enter bill amount: ");
        billAmount = scn.nextInt();

        // computation
       vatComputation = billAmount * vat;
       scComputition =  billAmount * serviceCharge;
       totalComputation = billAmount + vatComputation + scComputition;
       billPerPerson = totalComputation / numberOfPeople;
       // expected output(2)

       System.out.println("--- Receipt ---");
       System.out.println("Base Bill: " + billAmount );
       System.out.println("Vat: " + vat + "%" );
       System.out.println("Service: " + serviceCharge + "%" );
       System.out.println("-----------------------------");
       System.out.println("Total Bill: " + totalComputation);
       System.out.println(" Per Person: " + billPerPerson);
      
        scn.close();
        

    }
}





// === Restaurant Bill Splitter ===
// Enter number of people: 4
// Enter bill amount: 1200

// --- Receipt ---
// Base Bill: 1200.00
// VAT (12%): 144.00
// Service Charge (10%): 120.00
// -----------------------------
// Total Bill: 1464.00
// Per Person: 366.00