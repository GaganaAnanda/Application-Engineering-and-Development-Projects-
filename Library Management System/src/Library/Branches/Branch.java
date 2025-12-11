/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.Branches;

import Library.Library;
import Library.Profiles.BranchManagerProfile;
import Library.Profiles.Profile;

/**
 *
 * @author gagan
 */
public class Branch {
    String name;
    Profile manager;
    Library library;

    public Branch(String name, Library library, Profile manager){
        this.name = name;
        this.library = library;
        this.manager = manager;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public Profile getManager() {
        return manager;
    }

    public void setManager(Profile manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return this.name;
    }
    
    
}
