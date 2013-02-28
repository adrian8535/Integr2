package pl.com;


import javax.xml.ws.Endpoint;
import pl.com.BookManager;

public class Uslugodawca {

  public static void main(String[] args) {
    String url = "http://localhost:8080/books";
      BookManager bookManager  = new BookManager();

    Endpoint.publish(url, bookManager);
  }
}
