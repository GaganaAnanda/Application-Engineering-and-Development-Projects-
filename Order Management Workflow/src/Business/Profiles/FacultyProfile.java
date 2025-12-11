/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import Business.Person.Person;

/**
 *
 * @author gagan
 */
public class FacultyProfile extends Profile{
    
    public FacultyProfile(Person p){
        super(p);
    }
    
    
    //Overriding abstract methods
    @Override
    public String getRole(){
        return "Faculty";
    }
    
    //checking for matching person
    
    public boolean isMatch(String id){
        return person.getPersonId().equals(id);
    }
}
