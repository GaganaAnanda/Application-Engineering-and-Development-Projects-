
import Library.Branches.BranchDirectory;
import Library.UserAccounts.UserAccount;
import Library.UserAccounts.UserAccountDirectory;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gagan
 */
public class LibrarySystem {    
    
    UserAccount admin;
    UserAccountDirectory userAccountDirectory;
    BranchDirectory branchDirectory;

    public LibrarySystem(UserAccount admin) {
        this.admin = admin;
        this.userAccountDirectory = new UserAccountDirectory();
        this.branchDirectory = new BranchDirectory();
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public BranchDirectory getBranchDirectory() {
        return branchDirectory;
    }

    public void setBranchDirectory(BranchDirectory branchDirectory) {
        this.branchDirectory = branchDirectory;
    }

    public UserAccount getAdmin() {
        return admin;
    }
    
    
    
}
