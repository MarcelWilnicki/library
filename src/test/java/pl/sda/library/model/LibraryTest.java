package pl.sda.library.model;

//import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    @Test
    public void shouldAddBookWhenListOfBooksExists(){
        Library library = new Library();
        library.setBooks(new LinkedList<Book>());
        Book book = new Book();
        book.setTitle("W Pustyni i w Puszczy");

        library.addBook(book);

        assertEquals(Arrays.asList(book), library.getBooks());

    }

}