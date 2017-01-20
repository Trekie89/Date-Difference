package com.company;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args)  throws java.lang.Exception {

                //Telling the user what the program does.
                System.out.println("This program will tell you the time between two dates");
                System.out.println("");

                //Setting up scanner and Date format
                SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
                Scanner scanner = new Scanner(System.in);

                //Asking user for the first date and explaining the format
                System.out.println("Please give the first date in this format: MM/DD/YYYY");
                Date date1= format.parse(scanner.nextLine());

                //Asking for second date
                System.out.println("Please give the second date in same format");
                Date date2= format.parse(scanner.nextLine());

                scanner.close();

                //Calculating date into days
                long diff = date1.getTime()-date2.getTime();
                long diffDays = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

                //getting the positive number of the amount of days.
                diffDays = Math.abs(diffDays);

                //Converting the days into how many years months and days between the dates
                long year = diffDays / 365;
                long month = (diffDays % 365) / 30;
                long day = (diffDays % 365) % 30;

                System.out.println("The difference between your two dates is: "
                        + year + " year(s) " + month + " month(s) and " + day + " day(s).");


    }
}
