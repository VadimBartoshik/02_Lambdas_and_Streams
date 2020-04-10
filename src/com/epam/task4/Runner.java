package com.epam.task4;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        BD bd = new BD(new ArrayList<Author>(), new ArrayList<Book>());


        Author pyshkin = new Author("Пушкин", (short) 38, new ArrayList<Book>());
        Author esenin = new Author("Eceнин", (short) 30, new ArrayList<Book>());
        Author lermantov = new Author("Лермантов", (short) 27, new ArrayList<Book>());
        Author tolstoi = new Author("Толстой", (short) 82, new ArrayList<Book>());
        Author dostoevski = new Author("Достоевский", (short) 60, new ArrayList<Book>());

        bd.getAuthors().add(pyshkin);
        bd.getAuthors().add(esenin);
        bd.getAuthors().add(lermantov);
        bd.getAuthors().add(tolstoi);
        bd.getAuthors().add(dostoevski);


        Book captainDaughter = new Book("Капитанская дочка", new ArrayList<Author>(), 330);
        Book queenOfSpades = new Book("Пиковая дама", new ArrayList<Author>(), 200);
        Book bronzeHorseman = new Book("Медный всадник", new ArrayList<Author>(), 20);

        captainDaughter.getAuthors().add(pyshkin);
        queenOfSpades.getAuthors().add(pyshkin);
        queenOfSpades.getAuthors().add(lermantov);
        bronzeHorseman.getAuthors().add(pyshkin);


        Book blackMan = new Book("Чёрный человек", new ArrayList<Author>(), 300);
        Book birchTree = new Book("Берёза", new ArrayList<Author>(), 150);

        blackMan.getAuthors().add(esenin);
        birchTree.getAuthors().add(esenin);

        Book novice = new Book("Мцыри", new ArrayList<Author>(), 100);
        Book demon = new Book("Демон ", new ArrayList<Author>(), 150);
        Book borodino = new Book("Бородино", new ArrayList<Author>(), 10);

        novice.getAuthors().add(lermantov);
        demon.getAuthors().add(lermantov);
        demon.getAuthors().add(tolstoi);
        borodino.getAuthors().add(lermantov);


        Book warAndPeace = new Book("Война и мир", new ArrayList<Author>(), 3200);
        Book childhood = new Book("Детство", new ArrayList<Author>(), 150);
        Book confession = new Book("Исповедь", new ArrayList<Author>(), 300);

        warAndPeace.getAuthors().add(tolstoi);
        childhood.getAuthors().add(tolstoi);
        confession.getAuthors().add(tolstoi);


        Book crimeAndPunishment = new Book("Преступление и наказание", new ArrayList<Author>(), 800);
        Book devils = new Book("Бесы", new ArrayList<Author>(), 150);
        Book twin = new Book("Двойник", new ArrayList<Author>(), 300);

        crimeAndPunishment.getAuthors().add(dostoevski);
        devils.getAuthors().add(dostoevski);
        twin.getAuthors().add(dostoevski);

        bd.getBooks().add(captainDaughter);
        bd.getBooks().add(queenOfSpades);
        bd.getBooks().add(bronzeHorseman);

        bd.getBooks().add(blackMan);
        bd.getBooks().add(birchTree);

        bd.getBooks().add(novice);
        bd.getBooks().add(demon);
        bd.getBooks().add(borodino);

        bd.getBooks().add(warAndPeace);
        bd.getBooks().add(childhood);
        bd.getBooks().add(confession);

        bd.getBooks().add(crimeAndPunishment);
        bd.getBooks().add(devils);
        bd.getBooks().add(twin);

        bd.sortedBookByTitle(bd.getBooks());


    }
}
