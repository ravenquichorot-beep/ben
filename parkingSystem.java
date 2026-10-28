import java.util.Scanner;
public class parkingSystem {
    
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int carPrice = 50;
        int motoPrice = 30;
        int truckPrice = 80;
        
        String car = "Car";
        String moto = "Motorcycle";
        String truck = "Truck";

        int choice = 0;
        int basePrice = 2;

        
        int total = 0;
        int hours = 0;
        int price =0;

        System.out.print("What type of vehicle? Car [1] Motorcycle [2] Truck [3]: ");
        choice = scn.nextInt();
        
        System.out.print("How many hours did you park? ");
        hours = scn.nextInt();

        if(choice == 1){

           price = carPrice;
           
        }

        else if(choice == 2){
            price = motoPrice;
        }

        else if(choice == 3){
            price = truckPrice;
        }
        else{
            System.out.println("Invalid type of vehicle ");
            return;
        }

        if(hours <= 2){
            total = (price / 2);
            System.out.println(total);
        }

        // if(hours <= 2){
        //     total = price * hours;
        //     System.out.println(total);
        // }




        scn.close();
        
    }
}


/*
Car = 50 pesos/hour
Motorcycle = 30 pesos/hour
MonsterTruck = 80/hour
What's your vehicle type?

yung first 2 hours base price yung babayaran, 
after 2 hours kalahati na ang babayran
*/


/*
pseudo code

start
what type of vehicle ?

vehicle + base fare + additional time (after 2hours & half of the base fare ang bayad)


*/