/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.integracja.book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author 1
 */
public class Main {
    
    public static void main(String[] args) {
        
        List<Book> books = new ArrayList<Book>();
        books.add(new Book(1, "Programowanie Java", "Jan Kowalski", "001", 1985, "PWN", 350));
        books.add(new Book(2, "Jezyk XML", "Tomasz Nowak", "002", 1986, "NWE", 1570));
        books.add(new Book(3, "SQL i bazy danych", "John Marks", "003", 1988, "PWN", 650));
       
//        for(Book b : books) {   
//            System.out.println(String.format("%-10d%-10s%-10s%-10s%-10d%-10s%-10d", b.getId(), b.getTitle(), b.getAuthor(), b.getIsbn(), b.getYear(), b.getPublisher(), b.getPages()));
//        }
        
        List<Book> szukane = new ArrayList<Book>();
        BookManager bookManager = new BookManager(books);
        szukane = bookManager.searchByISBN("00");
        
        for(Book b : szukane) {   
            System.out.println(String.format("%-5d%-30s%-20s%-10s%-10d%-30s%-10d", b.getId(), b.getTitle(), b.getAuthor(), b.getIsbn(), b.getYear(), b.getPublisher(), b.getPages()));
        }
    }  
}
    
