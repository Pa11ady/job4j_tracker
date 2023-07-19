package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("book1", 100);
        Book book2 = new Book("book2", 200);
        Book book3 = new Book("book2", 250);
        Book book4 = new Book("Clean code", 464);
        Book[] books = {book1, book2, book3, book4};
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName());
        }
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        for (Book book : books) {
            System.out.println(book.getName());
        }
        for (Book book : books) {
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName());
            }
        }
    }
}
