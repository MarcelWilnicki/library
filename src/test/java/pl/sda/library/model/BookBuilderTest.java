package pl.sda.library.model;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BookBuilderTest {

    @Test
    public void shouldBuildBookWhenBookDetailsareDefined(){
        String authorFirstName = "Henryk";
        String authorLastName = "Senkiewicz";
        String title = "W pustyni i w puszczy";

        Book book = new BookBuilder().authorFirstName(authorFirstName)
                .authorLastName(authorLastName)
                .title(title)
                .build();

        assertNotNull(book);
        assertNotNull(book.getAuthor());
        assertEquals(authorFirstName, book.getAuthor().getFirstName());
        assertEquals(authorLastName, book.getAuthor().getLastName());
        assertEquals(title, book.getTitle());
    }
}