package assignment1;
/*
 * Author: [Your Full Name]
 * Program: SingersDemo.java
 * Date: [Insert Date]
 * Description: Driver class to test Singers class functionality.
 */

public class SingersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create singer1 using no-argument constructor
        Singers singer1 = new Singers();
        System.out.println("Default values of singer1:");
        singer1.display();

        // Set values using setters
        singer1.setId(101);
        singer1.setName("Taylor Swift");
        singer1.setAddress("Nashville, USA");
        singer1.setDateOfBirth("December 13, 1989");
        singer1.setNumAlbums(10);

        System.out.println("Updated values of singer1:");
        singer1.display();

        // Create another singer using parameterized constructor
        Singers singer2 = new Singers(102, "Ed Sheeran", "London, UK", "February 17, 1991", 6);
        System.out.println("Values of singer2:");
        singer2.display();

        // Use setAll() method
        singer2.setAll(103, "Adele", "Tottenham, UK", "May 5, 1988", 4);
        System.out.println("After using setAll() on singer2:");
        singer2.display();

	}

}
