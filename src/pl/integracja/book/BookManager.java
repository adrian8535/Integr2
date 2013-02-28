package pl.integracja.book;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
@WebService(serviceName = "BookManager")
public class BookManager {
    
    private List<Book> books;

    public BookManager(List<Book> books) {
        this.books = books;
    }
@WebMethod(operationName = "byTitle")    
public List<Book> searchByTitle(@WebParam(name = "title") String title) {
    
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
@WebMethod(operationName = "byAuthor")
public List<Book> searchByAuthor(@WebParam(name = "author") String author) {
    
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
@WebMethod(operationName = "byIsbn")
public List<Book> searchByISBN(@WebParam(name = "isbn") String isbn) {
    
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
