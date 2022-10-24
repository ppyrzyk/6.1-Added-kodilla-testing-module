package com.kodilla.stream;


import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;

import java.util.stream.Collectors;

public class StreamMain {

//    Kolektor Collectors.toList()
    public static void main(String[] args) {
//        BookDirectory theBookDirectory = new BookDirectory();
//        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()   // [1]
//                .filter(book -> book.getYearOfPublication() > 2005)                  // [2]
//                .collect(Collectors.toList());                                       // [3]
//
//        System.out.println("# elements: " + theResultListOfBooks.size());       // [4]
//        theResultListOfBooks.stream()                                           // [5]
//                .forEach(System.out::println);

//    Kolektor Collectors.toList()

//        BookDirectory theBookDirectory = new BookDirectory();
//
//        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toMap(Book::getSignature, book -> book));             // [1]
//
//        System.out.println("# elements: " + theResultMapOfBooks.size());             // [2]
//        theResultMapOfBooks.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue())                   // [3]
//                .forEach(System.out::println);                                            // [4]

//      Kolektor Collectors.joining()- Collectors.joining(String delimiter, String prefix, String suffix)

        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()  // [1]
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));                    // [2]

        System.out.println(theResultStringOfBooks);
    }
//   Powyższy kod tworzy strumień Stream dla kolekcji zwracanej przez metodę getList() klasy BookDirectory- filtruje ( PY >2005) i wyświetla obiekty książek
//        BookDirectory theBookDirectory = new BookDirectory();
//        theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .forEach(System.out::println);
//    }
}
//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//
//        System.out.println("Calculating expressions with lambdas");
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
//
//        System.out.println("Calculating expressions with method references");
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
//
////        Beautifying the text
//
//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//
//        poemBeautifier.beautify("TEST1 TEST2 ",text -> "test3 "  + text + "test4");
//        poemBeautifier.beautify("TEST1 TEST2 ",text -> "ABC" + " " + text + "ABC");
//        poemBeautifier.beautify("Text in upper case",text -> text.toUpperCase());
//        poemBeautifier.beautify("DOES TEXT IN LOWER CASE LOOK BETTER?",text -> text.toLowerCase());
//        poemBeautifier.beautify("Indenting the text by 8 spaces",text -> text.indent(8)); // next line after indenting is blank
//        poemBeautifier.beautify("Concatenating text: 1st part with ",text -> text.concat(" the 2nd part"));
//        poemBeautifier.beautify("Hello!",text -> text.repeat(6));
//
////Numbers Generator
//
//        System.out.println("Using Stream to generate even numbers from 1 to 20");
//        NumbersGenerator.generateEven(20);
//        People.getList().stream()                         // [1]
//                .forEach(System.out::println);                 // [2]
//
//        System.out.println("----------Transforming into Stream-------");
////        Operacje transformujące na Stream( tworzennie Stream)- map(Function mapper- gdzie mapper jest wyrażeniem lampda)
//
//        People.getList().stream()
//                .map(s -> s.toUpperCase())                      // [1]
//                .forEach(System.out::println);
//        System.out.println("\n");
//
//        People.getList().stream()
//                    .map(String::toUpperCase)                      // [1]
//                    .forEach(s -> System.out.println(s));          // [2]
//        System.out.println("\n");
//
////        Operacje filtrujące na STREAM (filter(Predicate predicate)- gdzie predicate jest wyrażeniem lambda
//        System.out.println("------Filtering into Stream----->");
//        People.getList().stream()
//                .filter(s -> s.length() > 11)
//                .forEach(System.out::println);
//
//
//        System.out.println("\nKaskadowe łączenie operacji na Stream\n");
//        People.getList().stream()
//                .map(String::toUpperCase)                             // [1]
//                .filter(s -> s.length() > 11)                         // [2]
//                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")   // [3]
//                .filter(s -> s.substring(0, 1).equals("M"))           // [4]
//                .forEach(System.out::println);                        // [5]
//
//
//        }


