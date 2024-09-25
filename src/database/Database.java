package database;
import contacts.Contact;

import java.util.ArrayList;



public class Database {
    private ArrayList<Contact> contacts;

    public Database(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public ArrayList<Contact> getDatabaseInfo() {
        return contacts;
    }

    public void viewAllContacts() {
    for (Contact contact : contacts) {
        System.out.println(contact.getContactInfo());
    }
}

    public Contact getContactByID(int id) {
        for (Contact contact : contacts) {
            if (contact.getID() == id) {
                return contact;
            }
        }
        return null;
    }

    public Contact getContactByName(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }

    public ArrayList<Contact> getContactsByCompany(String company) {
        ArrayList<Contact> companyContacts = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getCompany().equals(company)) {
                companyContacts.add(contact);
            }
        }
       return companyContacts;
    }

    public ArrayList<Contact> getContactsByTag(String tag) {
        ArrayList<Contact> companyContacts = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getTags().contains(tag)) {
                companyContacts.add(contact);
            }
        }
        return companyContacts;
    }

    public void addNewContact(Contact contact) {
        contacts.add(contact);
    }

    public void deleteContact(int id) {
        Contact contactToDelete = getContactByID(id);
        if (contactToDelete != null) {
            contacts.remove(contactToDelete);
        }
        else {
            System.out.println("Contact not found");
        }
    }

    public void updateContact(Contact contact) {
        Contact contactToUpdate = getContactByID(contact.getID());
        if (contactToUpdate != null) {
            contactToUpdate.setContactInfo(contact.getName(), contact.getEmail(), contact.getPhoneNumber(), contact.getCompany(), contact.getTags()); 
        }
        else {
            System.out.println("Contact not found");
        }
    }
}


