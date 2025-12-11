/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.Profiles;

import Library.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author gagan
 */
public class CustomerDirectory {
    ArrayList<CustomerProfile> customerlist;

    public CustomerDirectory() {
        this.customerlist = new ArrayList();
    }
    
    // Add new faculty to the facultylist
    public CustomerProfile newCustomerProfile(Person p){
        CustomerProfile cl = new CustomerProfile(p);
        customerlist.add(cl);
        return cl;
    }
}
