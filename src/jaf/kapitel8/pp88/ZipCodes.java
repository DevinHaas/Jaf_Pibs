package jaf.kapitel8.pp88;

import java.util.Scanner;

public class ZipCodes {

  String firstName;
  String lastName;
  int zip;
  Object[] list = new Object[26];

  public ZipCodes(String firstName, String lastName, int zip) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.zip = zip;
  }

  //creat a method to add zip codes as many you want
  public void addZipCodes() {
    Scanner scan = new Scanner(System.in);
    System.out.println("How many ZIP Codes do you want do add (max 25) ? ");
    int many = scan.nextInt();
    while (many > 25) {
      System.out.println("The max is 25 ! \n Give me a new number: ");
      many = scan.nextInt();
    }
    for (int i = 0; i <= many - 1; i++) {
      System.out.println("First Name: ");
      firstName = scan.next();
      System.out.println("Last Name: ");
      lastName = scan.next();
      System.out.println("ZIP Code: ");
      int zipCode = scan.nextInt();
      list[i] = new ZipCodes(firstName, lastName, zipCode);
    }
  }

  @Override
  public String toString() {
    return "firstName: " + firstName + '\t' + " lastName: " + lastName + '\t' + " zip; " + zip;
  }

  //creat a method to print the whole list
  public void toStringList() {
    for (int i = 0; i < list.length - 1; i++) {
      System.out.println(list[i]);
    }
  }
}
