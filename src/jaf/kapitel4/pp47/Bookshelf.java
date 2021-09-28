package jaf.kapitel4.pp47;

// **********************************************************************************************************
//  kapitel4.PP47.java           Author:Devin/Hasler
//  Creat the class Bookshelf to make it possible to creat books including author, date, publisher and title
// **********************************************************************************************************


public class Bookshelf {
    public static void main(String[] args){
        Book habits = new Book("7 Habits of Highly effective People",             //set the variables of habits
                "Hachete Book Group USA",
                "Stephen Covey",
                "1989 08 15");
        Book money = new Book("Money",                      //set the variables of money
                "FBV",
                "Tony Robbins",
                "2014 11 18");

        System.out.println(habits.getCopyrightDate());
        System.out.println(money.getTitle());
        System.out.println(money.getPublisher());

        System.out.println(habits);
        System.out.println(money);




    }
}
