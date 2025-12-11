/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.Profiles;

import Library.Book.Book;
import Library.Person.Person;
import Rental.RentalRecordDirectory;
import java.util.ArrayList;

/**
 *
 * @author gagan
 */
public class CustomerProfile extends Profile{
    
    private RentalRecordDirectory rentedBooks;
    
    public CustomerProfile(Person p){
        super(p);
        this.rentedBooks = new RentalRecordDirectory();
    }

    public RentalRecordDirectory getRentedBooks() {
        return rentedBooks;
    }
    
    //Overriding abstract methods
    @Override
    public String getRole(){
        return "Customer";
    }
}
