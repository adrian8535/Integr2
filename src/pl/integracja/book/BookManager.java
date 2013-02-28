package pl.integracja.book;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    
    private List<Book> books;

    public BookManager(List<Book> books) {
        this.books = books;
    }
    
public List<Book> searchByTitle(String title) {
    
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

public List<Book> searchByAuthor(String author) {
    
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

public List<Book> searchByISBN(String isbn) {
    
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
