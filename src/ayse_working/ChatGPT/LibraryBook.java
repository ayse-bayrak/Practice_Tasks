package ayse_working.ChatGPT;

public class LibraryBook {

    public String title;// instance variable
    public String author;
    public boolean isBorrowed;

    public void setInfo(String title, String author, boolean isBorrowed) {
        this.title = title;
        this.author = author;
        this.isBorrowed = isBorrowed;
    }

    public boolean borrowBook() {
        isBorrowed = true;
        if (!isBorrowed) {
            System.out.println("Book is already borrowed.");
        }
     return isBorrowed;
    }

    public boolean returnBook(){
        isBorrowed = false;
        if (isBorrowed) {
            System.out.println("Book is not currently borrowed.");
        }
        return isBorrowed;
    }

    public String toString() {
        return "Library Book System: " +
                "Title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isBorrowed=" + isBorrowed ;
    }
}
/*
Exercise: Library System

Create a Java class named LibraryBook.
Add the following instance variables to the class:
title (String): the title of the book
author (String): the author of the book
isBorrowed (boolean): indicates whether the book is currently borrowed or not
Create a constructor that initializes the title, author, and sets isBorrowed to false by default.
Create getter methods for each instance variable.
Create a method named borrowBook that sets isBorrowed to true if the book is not already borrowed. If the book is already borrowed, display a message like "Book is already borrowed."
Create a method named returnBook that sets isBorrowed to false if the book is currently borrowed. If the book is not borrowed, display a message like "Book is not currently borrowed."
Create a toString method that returns a string representation of the book, including all its details.
In the main method, create an array of LibraryBook objects, perform borrow and return operations, and print the details of the books.
 */