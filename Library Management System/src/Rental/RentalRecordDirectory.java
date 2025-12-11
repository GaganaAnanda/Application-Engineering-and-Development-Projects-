/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rental;

import Library.Book.Book;
import Library.Branches.Branch;
import Library.Library;
import Library.Profiles.CustomerProfile;
import java.util.ArrayList;

/**
 *
 * @author gagan
 */
public class RentalRecordDirectory {
    private ArrayList<RentalRecord> rentalRecords;

    public RentalRecordDirectory() {
        this.rentalRecords = new ArrayList<>();
    }

    public ArrayList<RentalRecord> getRentalRecords() {
        return rentalRecords;
    }
    
    public RentalRecord addRecord(Book book, CustomerProfile customer, Branch branch) {
        RentalRecord rentalRecord = new RentalRecord(book, customer, branch);
        this.rentalRecords.add(rentalRecord);
        return rentalRecord;
    }
    
    public void addRecord(RentalRecord r) {
        this.rentalRecords.add(r);
    }
    
    
    
}
