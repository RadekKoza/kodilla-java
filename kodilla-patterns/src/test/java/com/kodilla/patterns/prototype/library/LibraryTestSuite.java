package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {
    @Test
    void testGetBooks() {
        //Given
        Library mainLibrary = new Library("Biblioteka Główna");
        IntStream.iterate(1, i -> i + 1)
                .limit(7)
                .forEach(i -> mainLibrary.getBooks()
                        .add(new Book("Księga " + i, "A. Mickiewicz",
                                LocalDate.of(1830+i,1,1))));

        Library clonedLibrary = null;
        try {
            clonedLibrary = mainLibrary.shallowCopy();
            clonedLibrary.setName("Czytelnia");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = mainLibrary.deepCopy();
            deepClonedLibrary.setName("Biblioteka 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        Book book = new Book("Nowa księga", "A. Nowak", LocalDate.of(2001,3,31));
        mainLibrary.getBooks().add(book);

        //Then
        System.out.println(mainLibrary);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(8,mainLibrary.getBooks().size());
        assertEquals(8,clonedLibrary.getBooks().size());
        assertEquals(7,deepClonedLibrary.getBooks().size());
    }
}