/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rental;

import Library.Book.Book;
import Library.Branches.Branch;
import Library.Library;
import Library.Profiles.CustomerProfile;
import java.time.LocalDate;

/**
 *
 * @author gagan
 */
public class RentalRecord {
    static int id;
    Book book;
    CustomerProfile customer;
    Branch branch;
    LocalDate datetimeRented;
    LocalDate  datetimeReturned;
    boolean rentalStatus;
    int recordId;
    
    public RentalRecord(Book book, CustomerProfile customer, Branch branch) {
        this.recordId = RentalRecord.id++;
        this.book = book;
        this.customer = customer;
        this.branch = branch;
        this.rentalStatus = true;
        this.datetimeRented = LocalDate.now();
    }

    public static int getId() {
        return id;
    }

    public Book getBookName() {
        return book;
    }

    public void setBookName(Book bookName) {
        this.book = bookName;
    }

    public CustomerProfile getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerProfile customer) {
        this.customer = customer;
    }

    public LocalDate getDatetimeRented() {
        return datetimeRented;
    }

    public void setDatetimeRented(LocalDate datetimeRented) {
        this.datetimeRented = datetimeRented;
    }

    public LocalDate getDatetimeReturned() {
        return datetimeReturned;
    }

    public void setDatetimeReturned(LocalDate datetimeReturned) {
        this.datetimeReturned = datetimeReturned;
    }

    public int getRecordId() {
        return recordId;
    }

    public Branch getBranch() {
        return branch;
    }

    public boolean isRentalStatus() {
        return rentalStatus;
    }

    public void setRentalStatus(boolean rentalStatus) {
        this.rentalStatus = rentalStatus;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
    
    
    
    
        
}
