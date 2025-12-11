/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.Book;

import Library.Author.Author;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author gagan
 */
public class Book {
    
    static long count = 0;
    long sNum;
    String bookName;
    String registeredDate;
    long numPages;
    String language;
    boolean isRented;
    Author author;

    public Book(String bookName, String language, long numPages, Author author) {
        sNum = ++count;
        this.bookName = bookName;
        this.numPages = numPages;
        this.language = language;
        this.author = author;
        this.registeredDate = LocalDate.now().toString();
    }
    
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(String registeredDate) {
        this.registeredDate = registeredDate;
    }

    public long getNumPages() {
        return numPages;
    }

    public void setNumPages(long numPages) {
        this.numPages = numPages;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean isIsRented() {
        return isRented;
    }

    public void setIsRented(boolean isRented) {
        this.isRented = isRented;
    }

    public Author getAuthor() {
        return author;
    }

    public long getsNum() {
        return sNum;
    }

    @Override
    public String toString() {
        return bookName;
    }
    
    
    
}
