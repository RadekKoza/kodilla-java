package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream() // [1]
                        .filter(book -> book.getYearOfPublication() > 2005)
                        .map(Book::toString)
                        .collect(Collectors.joining(",\n","<<",">>"));// [2]
        System.out.println(theResultStringOfBooks);
    }
}
