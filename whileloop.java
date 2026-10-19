import java.util.Scanner;

public class whileloop {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        String name = "no";
        
        
        while(!name.equals("yes")){

            System.out.println("Do you want to go out with me? [yes] [no]");

            name = scn.nextLine();
        }
            System.out.println("Sige otw");

    scn.close();
    }
}
