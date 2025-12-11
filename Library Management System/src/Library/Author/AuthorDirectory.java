/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.Author;

import java.util.ArrayList;

/**
 *
 * @author gagan
 */
public class AuthorDirectory {
    
    private ArrayList<Author> authors;
    
    public AuthorDirectory() {
        this.authors = new ArrayList<>();
    }
    
    public Author addAuthor(String name) {
        Author author = new Author(name);
        this.authors.add(author);
        return author;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }
    
    
}
