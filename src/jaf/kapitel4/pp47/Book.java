package jaf.kapitel4.pp47;

// **********************************************************************************************************
//  kapitel4.PP47.java           Author:Devin/Hasler
//  Creat the class Book to make it possible to creat books including author, date, publisher and title
// **********************************************************************************************************

public class Book {                                     //instantiate the important variables
    private String title;
    private String publisher;
    private String author;
    private String copyrightDate;

    public Book(String title, String publisher, String author, String copyrightDate){
        this.author = author;
        this.copyrightDate = copyrightDate;
        this.publisher= publisher;
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }           //creat setter and getter methods

    public String getAuthor() {
        return author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setCopyrightDate(String copyrightDate) {
        this.copyrightDate = copyrightDate;
    }

    public String getCopyrightDate() {
        return copyrightDate;
    }

    @Override
    public String toString() {                                  //creat a multiline description with "\n"
        return
                " title = " + title+ "\n"+
                ", publisher = " + publisher+ "\n"+
                ", author = " + author+ "\n"+
                ", copyrightDate = " + copyrightDate;
    }
}
