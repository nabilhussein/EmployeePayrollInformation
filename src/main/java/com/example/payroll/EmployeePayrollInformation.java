package com.example.payroll;

import java.io.*;
import java.util.Scanner;

public class EmployeePayrollInformation {
    public static void main(String[] args) {


  //Read employee data from file
    //generate pay information
    //Print it out
    FileReader fileReader;

    {
        try {
            fileReader = new FileReader("PayDataFile");
            BufferedReader buferedReader = new BufferedReader(fileReader);
            String input;
            while ((input = buferedReader.readLine()) != null) {
                String[] subString =
                        input.split("\\|");
                Employee e =
                        new Employee(subString[0], subString[1], Double.parseDouble(subString[2]), Double.parseDouble(subString[3]));
                System.out.printf("%s %-30s $%.2f\n" ,e.getEmployeeID(),e.getEmployeeName(),e.getGrossPay());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
}

