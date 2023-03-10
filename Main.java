import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to gUBER, would you like to start your ride? ");
        String answer = in.nextLine();
        if(answer.equals("Yes")){
            System.out.println("Please, set the address as you wish: ");
            boolean finished = false;
            while(!finished){
                System.out.println("1. Home");
                System.out.println("2. om's"M);
                System.out.println("3. Cafe");
                System.out.println("4. Library");
                System.out.println("5. Park");
                System.out.println("0. To cancel riding with gUBER");
                int choice = in.nextInt();
                switch(choice) {
                    case 0: 
                    finished = true;
                    break;
                    
                    case 1: 

                    break;

                    case 2:

                    break;

                    case 3:

                    break;

                    case 4:

                    break;

                    case 5:

                    break;

                    default:
                    System.out.println("Not able to conclude choice, start all over again.");
                    finished = true;
                    break;
                }    
            }
            

            System.out.println("Finding you a driver...");
            System.out.println("Your driver is: " + driversName);
            System.out.println("Their score rate is : " + score);
            System.out.println("The car's model is : " + car);
            System.out.println("The car's plate is : " + plate);
            System.out.println("The value is: " + toBePaid);
        }
    }
}