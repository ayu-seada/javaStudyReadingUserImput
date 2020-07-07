package Ayu.Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth");
        boolean hasNextInt= scanner.hasNextInt();
        if (hasNextInt){
            int yearOfBirth = scanner.nextInt();
        scanner.nextLine();//handle next line charater

        int age = 2020-yearOfBirth;



         System.out.println("Enter your name: ");
        String name = scanner.nextLine();


            if (age>0 && age<150){
        System.out.println("Your name is " + name + " and you are " +age+ " old");
        }
            else System.out.println("You have entered invalid date of birth" );}


        scanner.close();
    }
}
