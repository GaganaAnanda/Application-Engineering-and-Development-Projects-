/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.Book;

import Library.Author.Author;
import java.util.ArrayList;

/**
 *
 * @author gagan
 */
public class BookDirectory {
    
    private ArrayList<Book> bookList;

    public BookDirectory() {
        this.bookList = new ArrayList<>();
    }
    
    public Book newBook(String name, String lang, long pages, Author auth) {
        Book b = new Book(name, lang, pages, auth);
        this.bookList.add(b);
        return b;
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }
}
