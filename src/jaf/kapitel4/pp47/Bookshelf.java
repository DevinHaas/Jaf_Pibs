package jaf.kapitel4.pp47;

// **********************************************************************************************************
//  kapitel4.PP47.java           Author:Devin/Hasler
//  Creat the class Bookshelf to make it possible to creat books including author, date, publisher and title
// **********************************************************************************************************


public class Bookshelf {
    public static void main(String[] args){
        Book book1 = new Book();
        Book book2 = new Book();

        book1.setAuthor("Stephen Covey");                           //set the variables of book1
        book1.setCopyrightDate("1989 08 15");
        book1.setPublisher("Hachete Book Group USA");
        book1.setTitle("7 Habits of Highly effective People");
        System.out.println();

        book2.setAuthor("Tony Robbins");                //set the variables of book2
        book2.setCopyrightDate("2014 11 18");
        book2.setTitle("Money");
        book2.setPublisher("FBV");

        System.out.println(book1.getCopyrightDate());
        System.out.println(book2.getTitle());
        System.out.println(book2.getPublisher());




    }
}
