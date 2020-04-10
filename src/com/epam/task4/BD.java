package com.epam.task4;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class BD {
    private List<Author> authors;
    private List<Book> books;


    public void findCountPagesMore200(List<Book> bookList) {
        List<Book> bookStream = bookList.stream().filter((page) -> page.getNumberOfPages() >= 200).collect(Collectors.toList());
        printBokList(bookStream);
    }

    public void sortedBookByPage(List<Book> bookList){
        List<Book> sortedByPage = bookList.stream().sorted((o1, o2) -> -o2.getNumberOfPages().compareTo(o1.getNumberOfPages())).
                collect(Collectors.toList());
      printBokList(sortedByPage);
    }

    public void sortedBookByTitle(List<Book> bookList){
        List<Book> sortedByName = bookList.stream().sorted((o1, o2) -> -o2.getTitle().compareTo(o1.getTitle())).
                collect(Collectors.toList());
        printBokList(sortedByName);
    }



    public void printFullListAuthor(List<Author> authorList){
        for (Author author : authorList) {
            System.out.println(author.getName());
        }
    }


    public String findMaxPageInBookList(List<Book> bookList) {
        Book book = bookList.stream().max((page1, page2) -> page1.getNumberOfPages().compareTo(page2.getNumberOfPages())).get();
        return book.getTitle();
    }


    public String findMinPageInBookList(List<Book> bookList) {
        Book book = bookList.stream().min((page1, page2) -> page1.getNumberOfPages().compareTo(page2.getNumberOfPages())).get();
        return book.getTitle();
    }

    public void findBooksWithOneAuthor(List<Book> bookList) {
        long count;
        for (Book book : bookList) {
            count = bookList.stream().filter(book.getAuthors()::equals).count();
            System.out.println(book.getTitle() + "   " + count);
        }
    }

    public void printBokList(List<Book> bookList) {
        for (Book book : bookList) {
            System.out.println(book.getTitle()+"  -  " + book.getNumberOfPages() +" страниц");
        }
    }


    public BD(List<Author> authors, List<Book> books) {
        this.authors = authors;
        this.books = books;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BD bd = (BD) o;
        return Objects.equals(authors, bd.authors) &&
                Objects.equals(books, bd.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authors, books);
    }

    @Override
    public String toString() {
        return "BD{" +
                "authors=" + authors +
                ", books=" + books +
                '}';
    }

}
