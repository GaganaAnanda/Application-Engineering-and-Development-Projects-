/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import Library.Book.BookDirectory;
import Library.Author.AuthorDirectory;
import Rental.RentalRecordDirectory;

/**
 *
 * @author gagan
 */
public class Library {
    String buildingNum;
    
    BookDirectory bookDirectory;
    AuthorDirectory authorDirectory;
    RentalRecordDirectory rentalRecordDirectory; 
    
    public Library(String num){
        this.buildingNum = num;
        this.bookDirectory = new BookDirectory();
        this.authorDirectory = new AuthorDirectory();
        this.rentalRecordDirectory = new RentalRecordDirectory();
    }

    public String getBuildingNum() {
        return buildingNum;
    }

    public void setBuildingNum(String buildingNum) {
        this.buildingNum = buildingNum;
    }

    public BookDirectory getBookDirectory() {
        return bookDirectory;
    }

    public void setBookDirectory(BookDirectory bookDirectory) {
        this.bookDirectory = bookDirectory;
    }

    public AuthorDirectory getAuthorDirectory() {
        return authorDirectory;
    }

    public void setAuthorDirectory(AuthorDirectory authorDirectory) {
        this.authorDirectory = authorDirectory;
    }

    public RentalRecordDirectory getRentalRecordDirectory() {
        return rentalRecordDirectory;
    }

    public void setRentalRecordDirectory(RentalRecordDirectory rentalRecordDirectory) {
        this.rentalRecordDirectory = rentalRecordDirectory;
    }

    
    
       
}
