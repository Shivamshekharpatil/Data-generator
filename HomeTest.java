import java.util.ArrayList;
import java.util.Scanner;

    public class HomeTest {
        public static void main(String[] args) {
            ArrayList<LogInSignIn> users = new ArrayList<LogInSignIn>();
            Scanner input = new Scanner(System.in); // to obtain input from user

            String email, password, username;

            //Greetings
            while (true) {
                System.out.println("WELCOME TO THE DATA GENERATOR");


                Scanner keyIn = new Scanner(System.in);
                new Scanner(System.in);
                System.out.println("Press Enter to continue......");
                keyIn.nextLine();

                //Home page
                System.out.println("*************  Home Page  **************");
                System.out.println("--------------------------------------------------------------------------");
                System.out.println("Start to begin.\n");
                System.out.println("1) Existing Employee\n" + "2) New Employee\n" + "3) Exit Program");
                int choice = input.nextInt();

                // using switch so that user can choose one of the given options and chosen option will execute the result

                switch (choice) {
                    case 1:
                        System.out.println("********** Log-in **********");
                        System.out.print("Email: "); //input logInSignIn information (email, password...)
                        email = input.next();
                        System.out.print("password: ");
                        password = input.next();

                        if (email.equals("sp28@redgate.ac.uk") && password.equals("Redgate#123")) {
                            System.out.println("Hurray! " + email + " " + "you have successfully login!");
                        } else {
                            System.out.println("Failed please check your login details");
                            System.out.println("If you are new user please select option Sign-in on the Home page of programme\n");
                        }
                        continue;

                    case 2:
                        System.out.println("********** Sign-in **********");
                        System.out.print("Username: "); //input logInSignIn information (Username, Email, password...)
                        username = input.next();
                        System.out.print("Email: ");
                        email = input.next();
                        System.out.print("Password: ");
                        password = input.next();
                        System.out.println("Thank you!" + " " + username + " " + "you can access the programme\n\n");
                        break;

                    default:
                        System.out.println("Invalid Input! You have exited the programme.");

                }


            }

        }
}
