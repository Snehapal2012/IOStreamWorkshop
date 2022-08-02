package com.addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class AddMultipleAddressBook {
    static ArrayList<Contacts> contactDetails=new ArrayList<Contacts>();
    HashMap<String, ArrayList<Contacts>> addressBook=new HashMap<>();

    public static void multipleAddressBook(){
        AddMultipleAddressBook addMultipleAddressBook=new AddMultipleAddressBook();
        System.out.println("Note: You can create 3 address book!");
        System.out.print("Please enter how many address book you want to create: ");
        Scanner scanner=new Scanner(System.in);
        int numOfAddressBook=scanner.nextInt();
        switch (numOfAddressBook){
            case 1: System.out.print("Enter the name of Address book: ");
            String name=scanner.next();
            addMultipleAddressBook.performance(addMultipleAddressBook,contactDetails);
            HashMap<String, ArrayList<Contacts>> addressBook=new HashMap<>();
            addressBook.put(name,contactDetails);
            break;
            case 2: System.out.print("Enter the name of Address book: ");
                String name1=scanner.next();
                addMultipleAddressBook.performance(addMultipleAddressBook,contactDetails);
                HashMap<String, ArrayList<Contacts>> addressBook1=new HashMap<>();
                addressBook1.put(name1,contactDetails);
                System.out.print("Enter the name of 2nd Address book: ");
                String name2=scanner.next();
                addMultipleAddressBook.performance(addMultipleAddressBook,contactDetails);
                HashMap<String, ArrayList<Contacts>> addressBook2=new HashMap<>();
                addressBook2.put(name2,contactDetails);
                addressBook1.putAll(addressBook2);
                break;
            case 3:System.out.print("Enter the name of Address book: ");
                String name3=scanner.next();
                addMultipleAddressBook.performance(addMultipleAddressBook,contactDetails);
                HashMap<String, ArrayList<Contacts>> addressBook3=new HashMap<>();
                addressBook3.put(name3,contactDetails);
                System.out.print("Enter the name of 2nd Address book: ");
                String name4=scanner.next();
                addMultipleAddressBook.performance(addMultipleAddressBook,contactDetails);
                HashMap<String, ArrayList<Contacts>> addressBook4=new HashMap<>();
                addressBook4.put(name4,contactDetails);
                addressBook3.putAll(addressBook4);
                System.out.print("Enter the name of 3rd Address book: ");
                String name5=scanner.next();
                addMultipleAddressBook.performance(addMultipleAddressBook,contactDetails);
                HashMap<String, ArrayList<Contacts>> addressBook5=new HashMap<>();
                addressBook5.put(name5,contactDetails);
                addressBook3.putAll(addressBook5);
        }

    }


    public static void inputDetails(ArrayList<Contacts> contactDetails){
        Scanner scanner=new Scanner(System.in);
        Contacts contacts=new Contacts();
        System.out.print("First name: ");
        contacts.setFirstName(scanner.next());
        System.out.print("Last name: ");
        contacts.setLastName(scanner.next());
        System.out.print("Address: ");
        contacts.setAddress(scanner.next());
        System.out.print("City: ");
        contacts.setCity(scanner.next());
        System.out.print("State: ");
        contacts.setState(scanner.next());
        System.out.print("Zip: ");
        contacts.setZip(scanner.next());
        System.out.print("Phone number: ");
        contacts.setPhoneNumber(scanner.next());
        System.out.print("Email: ");
        contacts.setEmail(scanner.next());
        contactDetails.add(contacts);
    }
    public static void display(ArrayList<Contacts> contactDetails){
        Iterator<Contacts> data=contactDetails.iterator(); {
            while(data.hasNext()){
                System.out.println(data.next());
            }
        }
    }
    public static void performance(AddMultipleAddressBook addMultipleAddressBook,ArrayList<Contacts> contactDetails){
        int numOfPerson;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of person's details you want to provide: ");
        numOfPerson=scanner.nextInt();
        for (int i=0;i<numOfPerson;i++){
            addMultipleAddressBook.inputDetails(contactDetails);
        }
        int choice;
        System.out.println("1) Input , 2)Display");
        System.out.print("Enter the choice you want to perform: ");
        choice=scanner.nextInt();
        switch (choice){
            case 1: addMultipleAddressBook.inputDetails(contactDetails);
            break;
            case 2: display(contactDetails);
            break;
            default:
                System.out.println("Invalid input!");

        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        AddMultipleAddressBook addMultipleAddressBook=new AddMultipleAddressBook();
        addMultipleAddressBook.multipleAddressBook();
    }
}
