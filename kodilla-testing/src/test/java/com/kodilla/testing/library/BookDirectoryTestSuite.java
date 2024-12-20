package com.kodilla.testing.library;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BookDirectoryTestSuite {
    private List<Book> generateListOfNBooks(int booksQuantity) {

        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Mock
    private LibraryDatabase libraryDatabaseMock;
    @Nested
    @DisplayName("Books with conditions test")
    class testsBooksWithConditions {
        @Test
        void testListBooksWithConditionsReturnList() {
            // Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOfBooks = new ArrayList<>();
            Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
            Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
            Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
            Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010); // [8]
            resultListOfBooks.add(book1);
            resultListOfBooks.add(book2);
            resultListOfBooks.add(book3);
            resultListOfBooks.add(book4);
            when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);
            //when
            List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");
            //Then
            assertEquals(4, theListOfBooks.size());
        }

        @Test
        void testListBooksWithConditionMoreThan20() {
            // Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOf0Books = new ArrayList<>();
            List<Book> resultListOf15Books = generateListOfNBooks(15);
            List<Book> resultListOf40Books = generateListOfNBooks(40);
            when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
            when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
            when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);
            // When
            List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
            List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
            List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
            // Then
            assertEquals(0, theListOfBooks0.size());
            assertEquals(15, theListOfBooks15.size());
            assertEquals(0, theListOfBooks40.size());
        }

        @Test
        void testListBooksWithConditionFragmentShorterThan3() {
            // Given
            LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            // When
            List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");
            // Then
            assertEquals(0, theListOfBooks10.size()); //[5]
            verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
        }
    }
    @Nested
    @DisplayName("Books in hands of user test")
    class testsBooksInHandsOff {
        @Test
        void testListBooksInHandsOf() {
            // Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            LibraryUser libraryUser0 = new LibraryUser("User0", "Library", "78100976591");
            LibraryUser libraryUser1 = new LibraryUser("User1", "Library", "78100976592");
            LibraryUser libraryUser5 = new LibraryUser("User5", "Library", "78100976593");
            List<Book> resultListOf0Books = new ArrayList<>();
            List<Book> resultListOf1Books = generateListOfNBooks(1);
            List<Book> resultListOf5Books = generateListOfNBooks(5);
            when(libraryDatabaseMock.listBooksInHandsOf(libraryUser0)).thenReturn(resultListOf0Books);
            when(libraryDatabaseMock.listBooksInHandsOf(libraryUser1)).thenReturn(resultListOf1Books);
            when(libraryDatabaseMock.listBooksInHandsOf(libraryUser5)).thenReturn(resultListOf5Books);
            // When
            List<Book> theListOfBooks0 = bookLibrary.listBooksInHandsOf(libraryUser0);
            List<Book> theListOfBooks1 = bookLibrary.listBooksInHandsOf(libraryUser1);
            List<Book> theListOfBooks5 = bookLibrary.listBooksInHandsOf(libraryUser5);
            // Then
            assertEquals(0, theListOfBooks0.size());
            assertEquals(1, theListOfBooks1.size());
            assertEquals(5, theListOfBooks5.size());
        }
    }
}
