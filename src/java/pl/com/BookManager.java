/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author 1
 */
@WebService(serviceName = "BookManager")
public class BookManager {
    private final List<Book> books;

    /**
     *
     */
    public BookManager() {
        books = new ArrayList<Book>();
        books.add(new Book(1, "Programowanie Java", "Jan Kowalski", "001", 1985, "PWN", 350));
        books.add(new Book(2, "Jezyk XML", "Tomasz Nowak", "002", 1986, "NWE", 1570));
        books.add(new Book(3, "SQL i bazy danych", "John Marks", "003", 1988, "PWN", 650));
 
    }
   

    public BookManager(List<Book> books) {
        books = new ArrayList<Book>();
        books.add(new Book(1, "Programowanie Java", "Jan Kowalski", "001", 1985, "PWN", 350));
        books.add(new Book(2, "Jezyk XML", "Tomasz Nowak", "002", 1986, "NWE", 1570));
        books.add(new Book(3, "SQL i bazy danych", "John Marks", "003", 1988, "PWN", 650));
        this.books = books;
    }
@WebMethod    
public List<Book> searchByTitle(@WebParam String title) {
    
    List<Book> szukane = new ArrayList<Book>();
    
    for (Book b : books) {
        //System.out.println(String.format("%-10d%-10s%-10s%-10s%-10d%-10s%-10d", b.getId(), b.getTitle(), b.getAuthor(), b.getIsbn(), b.getYear(), b.getPublisher(), b.getPages()));
        if (b.getTitle().toLowerCase().contains(title.toLowerCase())) {
            szukane.add(b); 
        }       
    }

//    for (Book b : szukane) {
//       System.out.println(String.format("%-10d%-10s%-10s%-10s%-10d%-10s%-10d", b.getId(), b.getTitle(), b.getAuthor(), b.getIsbn(), b.getYear(), b.getPublisher(), b.getPages()));   
//    }   
    return szukane; 
}
@WebMethod  
public List<Book> searchByAuthor(@WebParam String author) {
    
    List<Book> szukane = new ArrayList<Book>();
    
    for (Book b : books) {
        //System.out.println(String.format("%-10d%-10s%-10s%-10s%-10d%-10s%-10d", b.getId(), b.getTitle(), b.getAuthor(), b.getIsbn(), b.getYear(), b.getPublisher(), b.getPages()));
        if (b.getAuthor().toLowerCase().contains(author.toLowerCase())) {
            szukane.add(b); 
        }       
    }

//    for (Book b : szukane) {
//       System.out.println(String.format("%-10d%-10s%-10s%-10s%-10d%-10s%-10d", b.getId(), b.getTitle(), b.getAuthor(), b.getIsbn(), b.getYear(), b.getPublisher(), b.getPages()));   
//    }   
    return szukane; 
}
@WebMethod  
public List<Book> searchByISBN(@WebParam String isbn) {
    
    List<Book> szukane = new ArrayList<Book>();
    
    for (Book b : books) {
        //System.out.println(String.format("%-10d%-10s%-10s%-10s%-10d%-10s%-10d", b.getId(), b.getTitle(), b.getAuthor(), b.getIsbn(), b.getYear(), b.getPublisher(), b.getPages()));
        if (b.getIsbn().toLowerCase().contains(isbn.toLowerCase())) {
            szukane.add(b); 
        }       
    }

//    for (Book b : szukane) {
//       System.out.println(String.format("%-10d%-10s%-10s%-10s%-10d%-10s%-10d", b.getId(), b.getTitle(), b.getAuthor(), b.getIsbn(), b.getYear(), b.getPublisher(), b.getPages()));   
//    }   
    return szukane; 
}

}
