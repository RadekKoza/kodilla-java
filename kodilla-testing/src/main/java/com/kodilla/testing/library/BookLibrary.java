package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    private LibraryDatabase libraryDatabase;
    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }
    public List<Book> listBooksWithCondition(String titleFragment)
    {
        List<Book> bookList = new ArrayList<>(); //pusta lista
        if (titleFragment.length() < 3) return bookList; //zwraca pustą listę
        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment); // jak to działa???
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }
}
