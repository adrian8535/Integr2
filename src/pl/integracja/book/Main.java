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
        books.add(new Book(1, "Czerwony", "Adrian", "001", 1985, "Adrian", 35));
        books.add(new Book(2, "Niebieski", "Tomasz", "002", 1986, "Adrian", 35));
       
        for(Book b : books) {   
  //          System.out.println(String.format("%-10d%-10s%-10s%-10s%-10d%-10s%-10d", b.getId(), b.getTitle(), b.getAuthor(), b.getIsbn(), b.getYear(), b.getPublisher(), b.getPages()));
        }
        
        List<Book> szukane = new ArrayList<Book>();
        BookManager bookManager = new BookManager(books);
        szukane = bookManager.searchByTitle("Czerwon");
        
        for(Book b : szukane) {   
            System.out.println(String.format("%-10d%-10s%-10s%-10s%-10d%-10s%-10d", b.getId(), b.getTitle(), b.getAuthor(), b.getIsbn(), b.getYear(), b.getPublisher(), b.getPages()));
        }
    }  
}
    
