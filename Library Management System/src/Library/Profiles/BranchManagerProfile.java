/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.Profiles;

import Library.Person.Person;

/**
 *
 * @author gagan
 */
public class BranchManagerProfile extends Profile {
    
        static int empID;
        int experience;
    
        public BranchManagerProfile(Person p, int experience){
        super(p);
        this.experience =  experience;
        }

    public static int getEmpID() {
        return empID;
    }

    public static void setEmpID(int empID) {
        BranchManagerProfile.empID = empID;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
        
        
    
    
    //Overriding abstract methods
    @Override
    public String getRole(){
        return "BranchManager";
    }
}
