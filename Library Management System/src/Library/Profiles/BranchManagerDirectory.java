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
public class BranchManagerDirectory {
    
    ArrayList<BranchManagerProfile> managerlist;

    public BranchManagerDirectory() {
        this.managerlist = new ArrayList();
    }

    public ArrayList<BranchManagerProfile> getManagerlist() {
        return managerlist;
    }

    public void setManagerlist(ArrayList<BranchManagerProfile> managerlist) {
        this.managerlist = managerlist;
    }
    
    
    // Add new faculty to the facultylist
    public BranchManagerProfile newBranchManagerProfile(Person p, int exp){
        BranchManagerProfile ml = new BranchManagerProfile(p, exp);
        managerlist.add(ml);
        return ml;
    }
    
}
