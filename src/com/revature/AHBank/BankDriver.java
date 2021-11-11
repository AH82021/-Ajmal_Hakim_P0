package com.revature.AHBank;

import com.revature.AHBank.models.BankUser;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BankDriver {
    public static void main(String[] args) {

        boolean appIsOn = true;


        while (appIsOn){
// Bank Menu
            System.out.println("Welcome to AH Bank: PLease select from following option\n"
                    +"1) Login\n"
                    +"2) Create Account\n"
                    +"3) Deposit\n"
                    +"4  Withdraw\n"
                    +"5) View your current balance\n"
                    +"6) exit");

            Scanner scanner = new Scanner(System.in);
            int userInput =scanner.nextInt();

            switch (userInput){
                case 1:
                    login(); break;
                case 2:
                    createAccount(); break;
                case 3:
                    System.out.println("You select Deposit"); break;
                case 4:
                    System.out.println("You select withdraw"); break;
                case 5:
                    System.out.println("You select "); break;
                case 6:
                    System.out.println("You select exit");
                    System.out.println("Terminating ...");
                    appIsOn =false;
                    break;
                default:
                    System.out.println("Invalid choice: Please try again ");
            }

        }



    }
    //Method to crate new account
    public static void createAccount(){

        System.out.println("You  selected to crate new account");
        Scanner scanner =new Scanner(System.in);
        System.out.print("Please enter your First Name:");
        String firstName = scanner.nextLine();
        System.out.println("First Name:"+firstName);
        System.out.print("Please enter your last Name:");
        String  lastName =scanner.nextLine();
        System.out.println("Last Name:"+lastName);
        System.out.print("Please enter your Email Address:");
        String email = scanner.nextLine();
        System.out.println("Email Address:"+email);
        System.out.print("Please enter your social security number(***-**-****):");
        String  ssn=scanner.nextLine();
        System.out.println("Social Security Number:"+ssn);
        System.out.print("Please select your UserName:");
        String userName=scanner.nextLine();
        System.out.println("Username:"+userName);
        System.out.print("Please select your Password:");
        String passWord=scanner.nextLine();
        System.out.println("Password:"+passWord);

        BankUser newUser = new BankUser(firstName,lastName,email,ssn,userName,passWord);
        System.out.println("New user: "+newUser.toString());
       try {
           File usersFile = new File("resources/bankfile.txt");
           FileWriter fileWriter = new FileWriter(usersFile, true);//To append the file not override
           fileWriter.write(newUser.fileFormat() + "\n");
           fileWriter.close();
       }catch (IOException e){
           e.printStackTrace();
       }
    }
    // method tohandle login
    public static void login(){
        System.out.println("Yor selected login");
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter your username:");
        String userName=sc.nextLine();
        System.out.print("Please enter your Password:");
        String password = sc.nextLine();

    }




}
