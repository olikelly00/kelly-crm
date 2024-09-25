package main;

import java.util.ArrayList;
import contacts.Contact;
import database.Database;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Contact> contactList = new ArrayList<>();
        Database db = new Database(contactList);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Contact");
            System.out.println("2. View All Contacts");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addNewContact(db, scanner);
                    break;
                case 2:
                    db.viewAllContacts();
                    break;
                case 3:
                    updateNewContact(db, scanner);
                    break;
                case 4:
                    deleteContact(db, scanner);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }


 private static void addNewContact(Database db, Scanner scanner) {
        System.out.println("Enter contact ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  

        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();

        System.out.println("Enter contact email: ");
        String email = scanner.nextLine();

        System.out.println("Enter contact phone number: ");
        int phoneNumber = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Enter company name: ");
        String company = scanner.nextLine();

        System.out.println("Enter tags (comma-separated): ");
        String tagsInput = scanner.nextLine();
        ArrayList<String> tags = new ArrayList<>();
        for (String tag : tagsInput.split(",")) {
            tags.add(tag.trim());
        }

        Contact newContact = new Contact(id, name, email, phoneNumber, company, tags);
        db.addNewContact(newContact);
        System.out.println("Contact added successfully.");
    }



 private static void updateNewContact(Database db, Scanner scanner) {
        System.out.println("Enter contact ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();  

        Contact existingContact = db.getContactByID(id);
        if (existingContact != null) {
            System.out.println("Enter new contact name: ");
            String name = scanner.nextLine();

            System.out.println("Enter new contact email: ");
            String email = scanner.nextLine();

            System.out.println("Enter new contact phone number: ");
            int phoneNumber = scanner.nextInt();
            scanner.nextLine(); 

            System.out.println("Enter new company name: ");
            String company = scanner.nextLine();

            System.out.println("Enter new tags (comma-separated): ");
            String tagsInput = scanner.nextLine();
            ArrayList<String> tags = new ArrayList<>();
            for (String tag : tagsInput.split(",")) {
                tags.add(tag.trim());
            }

            // Update the existing contact's information
            existingContact.setContactInfo(name, email, phoneNumber, company, tags);
            System.out.println("Contact updated successfully.");
        } else {
            System.out.println("Contact with ID " + id + " not found.");
        }
    }



private static void deleteContact(Database db, Scanner scanner) {
        System.out.println("Enter contact ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  

        db.deleteContact(id);
        System.out.println("Contact deleted successfully.");
    }

}