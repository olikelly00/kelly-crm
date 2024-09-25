package contacts;

import java.util.ArrayList;


public class Contact {
    private int id;
    private String name;
    private String email;
    private int phoneNumber;
    private String company;
    private ArrayList<String> tags;

    public Contact(int id, String name, String email, int phoneNumber, String company, ArrayList<String> tags) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.company = company;
        this.tags = tags;
    }

    public String getContactInfo() {
        return "Name: " + name + ", Email: " + email + ", Phone Number: " + phoneNumber + ", Company: " + company + ", Tags: " + tags;
    }

    public void setContactInfo(String name, String email, int phoneNumber, String company, ArrayList<String> tags) {
        // not including id here since it's a unique identifier and it should not be updated once assigned
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.company = company;
        this.tags = tags;
    }
    
    public int getID() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public void addTag(String tag) {
        tags.add(tag);
    }
}


