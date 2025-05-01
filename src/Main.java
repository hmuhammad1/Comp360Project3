import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Comp360Registration registrationSystem = new Comp360Registration();


        Scanner scr = new Scanner(System.in);

        //menu
        while(true) {
            System.out.println("\n===== COMP 360 Registration Menu =====");
            System.out.println("1. Register\n2. Cancel\n3.Exit");
            int choice;

            try {
                choice = Integer.parseInt(scr.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                continue;
            }

            //select menu items
            switch (choice) {
                case 1:
                    System.out.println("Enter student name to be registered: ");
                    String name = scr.nextLine();
                    try {
                        registrationSystem.registerStudent(name);
                    } catch (ClassFullException e) {
                        e.displayError();
                    }
                    break;

                case 2:
                    System.out.println("Enter student name to cancel registration");
                    String CancelName = scr.nextLine();
                    registrationSystem.cancelRegistration(CancelName);
                    break;

                case 3:
                    System.out.println("Existing the system.");
                    scr.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        }
}
