package com.elo;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    static String MenuTable = "-ELO Program- \n-------------- \n|Program Menu|  \n-------------- \n1. List all players\n2. Search player name\n3. Play a game\n4. Create a new player\n5. Edit player data\n6. Exit program";
    static String UnderDevMessage = "This feature is under development";
    static String TerminalSpacer = "===================================";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userMenuInput;


        // Keep looping until user enters 6
        do {
            // Display menu
            System.out.println(TerminalSpacer + "\n" + MenuTable);
            System.out.print("Enter menu option: ");
            
            // Input validation
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 6.");
                scanner.next(); // discard invalid input
                System.out.print("Enter menu option: ");
            }

            userMenuInput = scanner.nextInt();

            switch (userMenuInput) {
                case 1:
                    System.out.println(TerminalSpacer + "\nList All Players:\n" + TerminalSpacer);
                    System.out.println(UnderDevMessage);
                    break;

                case 2:
                    System.out.println(TerminalSpacer + "\nSearch Player Name:\n" + TerminalSpacer);
                    System.out.println(UnderDevMessage);
                    break;

                case 3:
                    System.out.println(TerminalSpacer + "\nPlay A Game:\n" + TerminalSpacer);
                    System.out.println(UnderDevMessage);
                    break;

                case 4:
                    System.out.println(TerminalSpacer + "\nCreate A New Player:\n" + TerminalSpacer);
                    System.out.println(UnderDevMessage);
                    break;

                case 5:
                    System.out.println(TerminalSpacer + "\nEdit Player Data:\n" + TerminalSpacer);
                    System.out.println(UnderDevMessage);
                    break;

                case 6:
                    System.out.print(TerminalSpacer + "\nAre you sure you want to exit? (y/n):");
                    scanner.nextLine(); // flush leftover newline
                    String confirm = scanner.nextLine().trim().toLowerCase();

                    if (confirm.equals("y") || confirm.equals("yes")) {
                        System.out.println("\nExiting Program. \n" + TerminalSpacer);
                    } else {
                        userMenuInput = -1; // prevents loop from ending
                        System.out.println("Returning To Menu.\n");
                    }
                    break;

                default:
                    System.out.println("!!! \nInvalid option. Please enter a number between 1 and 6. \n!!!");
            }

        } while (userMenuInput != 6);

        scanner.close();
    }
}
