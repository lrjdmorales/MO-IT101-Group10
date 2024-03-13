package javaapplication1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class employeedetails {
    public static void main(String[] args) {
        String csvFilePath = "Resources/Employeedetails.csv";
        int lineNumber = -1;

        try (BufferedReader reader = new BufferedReader(new FileReader(csvFilePath))) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter employee number: ");
            int targetLine = scanner.nextInt();

            String line;
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                if (lineNumber == targetLine) {
                    String[] parts = line.split(",");

                    System.out.println("+---------------+-------------------+-------------------+");
                    System.out.println("| Employee ID\t|    First Name\t  |    Last Name\t  |");
                    System.out.println("+---------------+-------------------+-------------------+");

                    System.out.printf("| %-13s | %-17s | %-17s |\n", parts[0], parts[2], parts[1]);

                    System.out.println("+---------------+----------------------------------------+");

                    System.out.println("\nAdditional Details for Employee:");
                    System.out.println(
                            "+--------------------------------------------------------------------------------------------------+");
                    System.out.println(
                            "|       Birthday\t   |                  Address\t              |      Phone Number    |\t ");
                    System.out.println(
                            "+--------------------------------------------------------------------------------------------------+");

                    System.out.printf("| %-4s  |    %-1s      |      %-7s    |\n", parts[3], parts[4], parts[5]);
                    System.out.println(
                            "+---------------+-------------------+--------------------------------------------------------------+");

                    System.out.println("+---------------------------------------------------------------+");
                    System.out.println("|  Status\t  |   Position\t    |     Immediate Supervisor  |\t ");
                    System.out.println("+---------------------------------------------------------------+");

                    System.out.printf("| %-7s |  %-8s   |  %-10s  |\n", parts[10], parts[11], parts[12]);
                    System.out.println("+---------------------------------------------------------------+");
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
