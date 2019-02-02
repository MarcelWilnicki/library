package pl.sda.library;

import pl.sda.library.model.Book;
import pl.sda.library.model.BookBuilder;
import pl.sda.library.model.Library;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new BookBuilder()
                .authorFirstName("George")
                .authorLastName("Orwell")
                .title("1984")
                .build());

        library.addBook(new BookBuilder()
                .authorFirstName("Lew")
                .authorLastName("Tolstoy")
                .title("Anna Karenina")
                .build());

        library.addBook(new BookBuilder()
                .authorFirstName("Fiodor")
                .authorLastName("Dostoyewski")
                .title("Zbrodnia i Kara")
                .build());

        library.addBook(new BookBuilder()
                .authorFirstName("John")
                .authorLastName("Steinbeck")
                .title("Na wschód od edenu")
                .build());

        library.addBook(new BookBuilder()
                .authorFirstName("J.R.R")
                .authorLastName("Tolkien")
                .title("Hobbit")
                .build());

        library.addBook(new BookBuilder()
                .authorFirstName("Bram")
                .authorLastName("Stoker")
                .title("Dracula")
                .build());

        library.addBook(new BookBuilder()
                .authorFirstName("Leopold")
                .authorLastName("Tyrmand")
                .title("Zły")
                .build());

        library.addBook(new BookBuilder()
                .authorFirstName("Victor")
                .authorLastName("Hugo")
                .title("Nędznicy")
                .build());

        library.addBook(new BookBuilder()
                .authorFirstName("Yann")
                .authorLastName("Martel")
                .title("Życie Pi")
                .build());

        library.addBook(new BookBuilder()
                .authorFirstName("Vladimir")
                .authorLastName("Nabokov")
                .title("Lolita")
                .build());

        for (Book book: library.getBooks()) {
            System.out.println(book);
        }
    }

}
