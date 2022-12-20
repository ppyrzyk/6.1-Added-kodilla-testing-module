package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library theListLibrary = new Library("Library list");


        Book book1 = new Book("one", "1", LocalDate.now());
        Book book2 = new Book("two", "2", LocalDate.now());
        Book book3 = new Book("three", "3", LocalDate.now());
        Book book4 = new Book("four", "4", LocalDate.now());
        theListLibrary.getBooks().add(book1);
        theListLibrary.getBooks().add(book2);
        theListLibrary.getBooks().add(book3);
        theListLibrary.getBooks().add(book4);

        //shallow copy
        Library clonedTheListLibrary = null;
        try {
            clonedTheListLibrary = theListLibrary.shallowCopy();
            clonedTheListLibrary.setName("Shallow copy list");
        } catch(CloneNotSupportedException e) {
            System.out.println(e);
        }

        //deep copy
        Library deepClonedTheListLibrary = null;
        try {
            deepClonedTheListLibrary = theListLibrary.deepCopy();
            deepClonedTheListLibrary.setName("Deep clone list");
        } catch(CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        theListLibrary.getBooks().remove(book1);


        //Then
        System.out.println(theListLibrary);
        System.out.println(clonedTheListLibrary);
        System.out.println(deepClonedTheListLibrary);
        Assert.assertEquals(3, theListLibrary.getBooks().size());
        Assert.assertEquals(3, clonedTheListLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedTheListLibrary.getBooks().size());
        Assert.assertEquals(clonedTheListLibrary.getBooks(), theListLibrary.getBooks());
        Assert.assertNotEquals(deepClonedTheListLibrary.getBooks(), theListLibrary.getBooks());
    }
}

