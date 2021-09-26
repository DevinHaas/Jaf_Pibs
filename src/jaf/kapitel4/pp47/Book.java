package jaf.kapitel4.pp47;

import java.util.Date;

public class Book {
    private String title;
    private String publisher;
    private String author;
    private Date copyrightDate;

    public Book(){
        this.author = "";
        this.copyrightDate = new Date(0000, 00, 00);
        this.publisher= "";
        this.title = "";
    }

    public void setAuthor(String author) {
        this.author = author;
    }

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

    public void setCopyrightDate(Date copyrightDate) {
        this.copyrightDate = copyrightDate;
    }

    public Date getCopyrightDate() {
        return copyrightDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", author='" + author + '\'' +
                ", copyrightDate=" + copyrightDate +
                '}';
    }
}
