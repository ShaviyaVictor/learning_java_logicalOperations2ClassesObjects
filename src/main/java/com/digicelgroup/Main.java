package com.digicelgroup;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // System.out.println("Hello world!");

        // Logical Operators
        /*
        && for and; || for or; ! for not;

        boolean isAdult = false;
        boolean isStudent = true;
        boolean isShaviya = true;

        System.out.println((isAdult || isStudent) && !isShaviya);
        System.out.println(!isShaviya);
         */

        // If Statements
        /*
        These allow you to run a certain piece of your code depending on the results of your boolean expressions

        int age = 18;
        if (age > 18) {
            System.out.println("Hooray! I am an adult!");
        } else if (age < 18) {
            System.out.println("Ah! Still a minor!");
        } else {
            System.out.println("I should be home.");
        }
         */

        // Ternary Operator
        /*
        Alternate for when you only have two comparisons such as the one below
        int age = 14;
        if (age > 18) {
            System.out.println("Hooray! I am an adult!");
        } else {
            System.out.println("I should be home.");
        }
         */

        // Below is the a Ternary Operator
        /*
        int age = 14;
        String message = (age >= 18) ? "I am an adult" : "I should be home."; {
            System.out.println(message);
        }
         */

        // Switch Statememnts
        /*
        They are more like the if statements just a little different
        String gender = "Male";
        switch (gender) {
            case "Female":
                System.out.println("I am Female");
                break;
            case "Male":
                System.out.println("I am male");
                break;
            case "I prefer not to say.":
                System.out.println("Unknown!");
                break;
            default:
        }
         */

        // Arrays
        /*
        Arrays allow us to create 1 variable that holds more than one value

        int [] numbers = new int[2];
        numbers[0] = 89;
        numbers[1] = 999;
        System.out.println(Arrays.toString(numbers));


        int [] numbers = {12, 45, 88, 66};
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);

        String [] names = {"Jane", "Norris", "Josphine", "Shaviya"};
        System.out.println(Arrays.toString(names));
        System.out.println(names.length);
         */

        // Arrays and Indexes
        /*
        String [] names = {
                "Mom", "Norris", "Jos", "Shaviya"
        };
        String me = names[names.length -1];

        System.out.println(me);
         */

        // i++ && i-- ==> Incrementing and Decrementing the initial value by 1

        /*

        int number = 31;
        number += 5;
        System.out.println(number);
         */

        // Enhanced for Loop
        /*
        int[] num = {2, 8, 22, 25, 38, 88, 100};
        String [] names = {"Shaviya", "Ryan", "Whyte", "Jane", "Norris"};

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        System.out.println("Enhanced For Loops");
        for (int number : num) {
            System.out.println(number);
        }

        System.out.println("Printing the names");
        for (String name : names) {
            System.out.println(name);
        }
         */

        // IDE Bonus tip

        /*
        int[] num = {22, 12, 32, 42, 24};
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.println(num[i]);
        }

        String[] names = {"Vic", "Shav", "Musungu"};
        for (String name : names) {
            System.out.println(name);
        }

        int[] num = {22, 12, 32, 42, 24};
        String[] names = {"Vic", "Shav", "Musungu"};

        Arrays.stream(num).forEach(System.out::println);
        Arrays.stream(names).forEach(System.out::println);
         */

        // Break && Continue
        /*
        The break keyword helps us break out of the loop when a certain condition is achieved
        The continue keyword helps in jumping a certain condition and going to the next
         */

        /*String[] names = {"Victor", "Shaviya", "Musungu", "Junior"};
        Arrays.stream(names).forEach(System.out::println);

        for (String name : names) {
            if (name.equals("Musungu")) {
                break;
            }
            System.out.println(name);
        }*/

        // While Loop
        // It allows us to loop when a specified boolean expression equals to True

        /*int count = 1;
        while (count <= 5) {
            System.out.println("We are getting there! - " + count);
            count ++;
        }*/

        // Do While Loop will run the program at least once

        /*int count = 22;

        do {
            System.out.println(count);
            count++;
        }
        while (count <= 12);*/

        // Scanner Class
        // This allows us to take User Input from the console

        // My first Java Program
        /*Scanner shav = new Scanner(System.in);
        System.out.println("Will you make it here?.?");
        String hope = shav.nextLine();

        System.out.println(hope + " - That is the spirit bro!");

        System.out.println("You have such high hopes in the Lord. How old are you?");
        int age = shav.nextInt();
        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("You were born in the year " + year );

        if (age < 18) {
            System.out.println("You are a minor!");
        } else {
            System.out.println("You are an adult!");
        }*/

        // Methods
        /*This is a block of code that only run when it is called
        You can pass data(Parameters) into a method
        Methods are used to perform any logic/actions/to transforms data
        There in-built methods and user pre-defined methods
        They include: println(); .toUpperCase();
        Methods always end with the parenthesis()
        There are classes that come with their pre-defined methods eg: String class*/

        // System.out.println("Hello".toUpperCase());

        // Classes and Objects
        /*
        * Class is a blueprint to create anything that I want
        * Classes have Attributes
        * Objects are obtained from classes*/

        // Creating Classes and Objects - We create the Class/Blueprint first then from the Class we come up with the actual Object

        /*Lens lensOne = new Lens(
                "Sony",
                "85mm",
                true);
        Lens lensTwo = new Lens(
                "Samsung",
                "85-100mm",
                false);

        // Printing Object Attributes
        System.out.println("Lens 1:");
        System.out.println(lensOne.brand);
        System.out.println(lensOne.focalLength);
        System.out.println(lensOne.isPrime);

        System.out.println();

        System.out.println("Lens 2:");
        System.out.println(lensTwo.brand);
        System.out.println(lensTwo.focalLength);
        System.out.println(lensTwo.isPrime);*/

        // Customs methods go all the way down!
        // Custom methods
        /*char[] letters = {'A', 'B', 'B', 'C', 'C', 'C', 'D', 'D', 'D', 'D'};
        int count = countOccurrences(letters);

        System.out.println(count);*/

        // Passport objects
        Passport passportOne = new Passport(
                "AB0090072",
                "Kenya",
                LocalDate.of(2034,03,03)
        );
        System.out.println("Passport No: " + passportOne.passportNo);
        System.out.println("Country of issue: " + passportOne.countryIssued);
        System.out.println("Date of expiry: " + passportOne.expiryDate);

    }

    // Class example
    /*static class Lens {
        String brand;
        String focalLength;
        boolean isPrime;

        Lens(String brand, String focalLength, boolean isPrime) {
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }

    }*/

    // For the custom method
    /*public static int countOccurrences(char[] letters) {
        System.out.println(Arrays.toString(letters));
        int count = 0;
        for (char letter : letters) {
            if (letter == 'D') {
                count++;
            }
        }
        return count;
    }*/

    // Passport class example 2
    static class Passport {
        String passportNo;
        String countryIssued;
        LocalDate expiryDate;

        Passport(String passportNo, String countryIssued, LocalDate expiryDate) {
            this.passportNo = passportNo;
            this.countryIssued = countryIssued;
            this.expiryDate = expiryDate;
        }
    }

}