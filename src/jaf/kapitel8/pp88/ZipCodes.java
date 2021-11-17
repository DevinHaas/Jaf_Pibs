package jaf.kapitel8.pp88;

import java.util.Scanner;

public class ZipCodes {

  String firstName;
  String lastName;
  int zip;
  Object[] list = new Object[26];

  public ZipCodes(String firstName, String lastName, int zip){
   this.firstName = firstName;
   this.lastName = lastName;
   this.zip = zip;
  }

  public void addZipCodes(){
    Scanner scan = new Scanner(System.in);
    System.out.println("How many ZIP Codes do you want do add (max 24) ? ");
    int many = scan.nextInt();
    while( many < 26){
      for(int i = 0; i <= many; i++){
        System.out.println("First Name: ");
        String firstName = scan.next();
        System.out.println("Last Name: ");
        String lastName = scan.next();
        System.out.println("ZIP Code: ");
        int zipCode = scan.nextInt();
        list[i] = new ZipCodes(firstName, lastName, zipCode);
    }

    }

  }

  @Override
  public String toString() {
    return
        "firstName: " + firstName + '\t' +
        " lastName: " + lastName + '\t' +
        " zip; " + zip;
  }

  public void toStringList(){
    for(int i = 0; i < list.length-1; i++){
      System.out.println(list[i]);
    }
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setZip(int zip) {
    this.zip = zip;
  }
}
