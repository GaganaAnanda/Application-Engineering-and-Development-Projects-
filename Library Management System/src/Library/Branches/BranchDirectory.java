/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.Branches;

import Library.Library;
import Library.Person.Person;
import Library.Profiles.BranchManagerProfile;
import java.util.ArrayList;

/**
 *
 * @author gagan
 */
public class BranchDirectory {
      
    ArrayList<Branch> branchlist ;
    
      public BranchDirectory (){
       branchlist = new ArrayList();
    }

    public Branch newBranch(String name, Library library, BranchManagerProfile manager) {
        Branch b = new Branch(name, library, manager);
        branchlist.add(b);
        return b;
    }
    
    public void addBranch(Branch b){
        branchlist.add(b);
    }

    public ArrayList<Branch> getBranchlist() {
        return branchlist;
    }
    
    public void deleteBranch(Branch b) {
        
    }
    
}
