import com.github.javafaker.Faker;

import java.util.Date;
import java.util.Scanner;

    public class GenerateTestData {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Faker faker = new Faker();

            while (true) {
                System.out.println("\nThe Generator");

                Scanner keyIn = new Scanner(System.in);
                new Scanner(System.in);
                System.out.println("Press Enter to continue......");
                keyIn.nextLine();
                int n;

                //Generator page
                System.out.println("1)First name\n" + "2)Last name\n" + "3)Full name\n" + "4)Phone number\n" + "5)Address\n"
                        + "6)Favourite Superhero\n" + "7)Birth-Date\n" + "8)Company\n");
                System.out.print("Choose what would you like to generate: ");
                int choice = sc.nextInt();
                System.out.print("Please specify the length: ");
                n = sc.nextInt();
                System.out.println();

                switch (choice) {

                    case 1:
                        System.out.println("***** First name *****\n");
                        for (int i = 1; i < n; i++) {
                            String firstName = faker.name().firstName();
                            System.out.println("First name: " + " " + firstName);
                        }
                        String firstName = faker.name().firstName();
                        System.out.println("First name: " + " " + firstName);
                        System.out.println("Thank you! for using this programme. I hope you are satisfied with the results.");
                        break;

                    case 2:
                        System.out.println("***** Last name *****\n");
                        for (int i = 1; i < n; i++) {
                            String lastName = faker.name().lastName();
                            System.out.println("last name: " + " " + lastName);
                        }
                        String lastName = faker.name().lastName();
                        System.out.println("last name: " + " " + lastName);
                        System.out.println("Thank you for using this programme. I hope you are satisfied with the result!");
                        break;

                    case 3:
                        System.out.println("***** Full name *****\n");
                        for (int i = 1; i < n; i++) {
                            System.out.println("First name: " + "" + faker.name().firstName() + " || " +
                                    "last name: " + "" + faker.name().lastName());
                        }
                        System.out.println("First name: " + "" + faker.name().firstName() + " || " +
                                "last name: " + "" + faker.name().lastName());
                        System.out.println("Thank you for using this programme. I hope you are satisfied with the result!");
                        break;

                    case 4:
                        System.out.println("***** Phone number *****\n");
                        for (int i = 1; i < n; i++) {
                            String phone = faker.phoneNumber().phoneNumber();
                            System.out.println(phone);
                        }
                        String phone = faker.phoneNumber().phoneNumber();
                        System.out.println(phone);
                        System.out.println("Thank you for using this programme. I hope you are satisfied with the result!");
                        break;

                    case 5:
                        System.out.println("***** Address *****\n");
                        for (int i = 1; i < n; i++) {
                            String address = faker.address().fullAddress();
                            System.out.println(address);
                        }
                        String address = faker.address().fullAddress();
                        System.out.println(address);
                        System.out.println("Thank you for using this programme. I hope you are satisfied with the result!");
                        break;

                    case 6:
                        System.out.println("***** Favourite Superhero *****\n");
                        for (int i = 1; i < n; i++) {
                            String superhero = faker.superhero().name();
                            System.out.println(superhero);
                        }
                        String superhero = faker.superhero().name();
                        System.out.println(superhero);
                        System.out.println("Thank you for using this programme. I hope you are satisfied with the result!");
                        break;

                    case 7:
                        System.out.println("***** Birth-Date *****\n");
                        for (int i = 1; i < n; i++) {
                            String Date = String.valueOf(faker.date().birthday());
                            System.out.println(Date);
                        }
                        String Date = String.valueOf(faker.date().birthday());
                        System.out.println(Date);
                        System.out.println("Thank you for using this programme. I hope you are satisfied with the result!");
                        break;

                    case 8:
                        System.out.println("***** Company *****\n");
                        for (int i = 1; i < n; i++) {
                            String company = faker.company().name();
                            System.out.println(company);
                        }
                        String company = faker.company().name();
                        System.out.println(company);
                        System.out.println("Thank you for using this programme. I hope you are satisfied with the result!");
                        break;

                    default:
                        System.out.println("Error: XXX..... :(");

                }

            }
        }
    }


