package assignment1;
/*
 /* Author: Bat An 
 * Program: Singers.java
 * Date: [14/09/2025]
 * Description: Class to represent Singer objects with id, name, address,
 *              date of birth, and number of albums published.
 */

public class Singers {
    // Instance variables
    private int id;
    private String name;
    private String address;
    private String dateOfBirth;
    private int numAlbums;

    // No-argument constructor
    public Singers() {
        this.id = 0;
        this.name = "Unknown";
        this.address = "Not Provided";
        this.dateOfBirth = "Not Provided";
        this.numAlbums = 0;
    }

    // Parameterized constructor
    public Singers(int id, String name, String address, String dateOfBirth, int numAlbums) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.numAlbums = numAlbums;
    }

    // Individual setters
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setAddress(String address) { this.address = address; }
    public void setDateOfBirth(String dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    public void setNumAlbums(int numAlbums) { this.numAlbums = numAlbums; }

    // One setter to set all values
    public void setAll(int id, String name, String address, String dateOfBirth, int numAlbums) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.numAlbums = numAlbums;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getDateOfBirth() { return dateOfBirth; }
    public int getNumAlbums() { return numAlbums; }

    // Display function
    public void display() {
        System.out.println("Singer ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Number of Albums Published: " + numAlbums);
        System.out.println("-----------------------------------");
    }
}
