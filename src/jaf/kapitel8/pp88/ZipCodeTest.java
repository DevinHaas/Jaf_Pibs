package jaf.kapitel8.pp88;

public class ZipCodeTest{
  public static void main(String[] args){

    //creat a new ZipCode
    ZipCodes zip = new ZipCodes("", "", 0);
    //add as many zipcodes as you want
    zip.addZipCodes();
    //print the appropriate messages
    zip.toStringList();



  }

}
