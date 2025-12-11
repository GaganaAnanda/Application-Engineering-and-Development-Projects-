
import Library.Author.AuthorDirectory;
import Library.Branches.Branch;
import Library.Branches.BranchDirectory;
import Library.Library;
import Library.Person.Person;
import Library.Person.PersonDirectory;
import Library.Profiles.AdminProfile;
import Library.Profiles.BranchManagerDirectory;
import Library.Profiles.BranchManagerProfile;
import Library.Profiles.CustomerDirectory;
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
public class ConfigureALibraryManagement {
    
    static LibrarySystem initialize(){
        
        PersonDirectory personDirectory = new PersonDirectory();
        
        Person p1 = personDirectory.newPerson("John Smith");
        Person p2 = personDirectory.newPerson("Gina Montana");
        Person p3 = personDirectory.newPerson("Adam Rollen");
        Person p4 = personDirectory.newPerson("Jim Dellon");
        Person p5 = personDirectory.newPerson("Anna Shnider");
        Person p6 = personDirectory.newPerson("Laura Brown");
        Person p7 = personDirectory.newPerson("Jack While");
        Person p8 = personDirectory.newPerson("John Doe");     
        
        AdminProfile admin = new AdminProfile(p1);
        UserAccount adminAccount = new UserAccount(admin, "admin", "****");
        
        LibrarySystem sc = new LibrarySystem(adminAccount);
        
        BranchDirectory bd = sc.getBranchDirectory();
        

        Library lib1 =  new Library("101");      
        Library lib2 = new Library("102");
        
        AuthorDirectory ad = lib1.getAuthorDirectory();
        AuthorDirectory ad2 = lib2.getAuthorDirectory();
        
        ad.addAuthor("AAAA");
        ad.addAuthor("BBB");
        ad.addAuthor("CCC");
        
        ad2.addAuthor("AAAA");
        ad2.addAuthor("BBB");
        ad2.addAuthor("CCC");
        
        
        
        
        BranchManagerProfile branchManager1 = new BranchManagerProfile(p7, 5);
        BranchManagerProfile branchManager2 = new BranchManagerProfile(p6, 5);
        
        Branch b1 = bd.newBranch("b1", lib1, branchManager1);
        Branch b2 = bd.newBranch("b2", lib2, branchManager2);
        
        CustomerDirectory cd = new CustomerDirectory();
        
        UserAccountDirectory uadirectory = sc.getUserAccountDirectory();
        uadirectory.addUserAccount(adminAccount);
        uadirectory.newUserAccount(branchManager1, "branch1", "0000");
        uadirectory.newUserAccount(branchManager2, "branch2", "0000");
        uadirectory.newUserAccount(cd.newCustomerProfile(p2), "customer1", "0000");
        uadirectory.newUserAccount(cd.newCustomerProfile(p3), "customer2", "0000");
        uadirectory.newUserAccount(cd.newCustomerProfile(p4), "customer3", "0000");
        uadirectory.newUserAccount(cd.newCustomerProfile(p5), "customer4", "0000");
        uadirectory.newUserAccount(cd.newCustomerProfile(p8), "customer5", "0000");
        
        return sc;
    }
    
    
//    static Branch initialize(String name, String num){
//        
//        Library lib =  new Library(num);      
//        Branch brch = new Branch(name,lib);
//
//
//        //Create Person
//        PersonDirectory personDirectory = lib.getPerDirectory();
//        
//        Person p1 = personDirectory.newPerson("John Smith");
//        Person p2 = personDirectory.newPerson("Gina Montana");
//        Person p3 = personDirectory.newPerson("Adam Rollen");
//        Person p4 = personDirectory.newPerson("Jim Dellon");
//        Person p5 = personDirectory.newPerson("Anna Shnider");
//        Person p6 = personDirectory.newPerson("Laura Brown");
//        Person p7 = personDirectory.newPerson("Jack While");
//        
//        //
//        
//        
//        // Create Branch Managers to manage the library
//        BranchManagerDirectory branchManagerDirectory = lib.getBrnchMngDirectory();
//        BranchManagerProfile branchManager1 = branchManagerDirectory.newBranchManagerProfile(p2);
//        BranchManagerProfile branchManager2 = branchManagerDirectory.newBranchManagerProfile(p3);
//        
//        // Create User accounts that link to specific profiles
//        UserAccountDirectory uadirectory = lib.getUserAcntDirectory();
//        UserAccount ua1 = uadirectory.newUserAccount(branchManager1, "BranchManager1", "****");
//        UserAccount ua2 = uadirectory.newUserAccount(branchManager2, "BranchManager2", "****");
//        
//        
//        return brch;
//    }
    
}
