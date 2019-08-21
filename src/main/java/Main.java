/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */

import generics.Library;
import generics.Swap;
import java.util.Arrays;
import models.Book;

public class Main {

    public static void main(String[] args) {
        testSwap();

        testOldSchoolLibrary();
        testGenericLibrary();
    }

    private static void testGenericLibrary() {
        Library<Book> bookLibrary = new Library<>();

        Book book1 = new Book("Moby-Dick", "Herman Melville");
        Book book2 = new Book("Lord of the Flies", "William Golding");

        bookLibrary.add(book1);
        bookLibrary.add(book2);

        System.out.println(bookLibrary.getItemsByName("Moby-Dick").get().getInformation());
    }


    private static void testOldSchoolLibrary() {
        oldSchool.Library bookLibrary = new oldSchool.Library();

        Book book1 = new Book("Moby-Dick", "Herman Melville");
        Book book2 = new Book("Lord of the Flies", "William Golding");

        bookLibrary.add(book1);
        bookLibrary.add(book2);

        System.out.println(bookLibrary.getItemByName("Moby-Dick").get().getInformation());
    }

    public static void testSwap() {
        Integer[] numbers = new Integer[]{1, 2, 3};
        String[] words = new String[]{"One", "Two", "Three"};

        Swap.swapElements(words, 0, 2);
        System.out.println(Arrays.toString(words));

        Swap.swapElements(numbers, 0, 2);
        System.out.println(Arrays.toString(numbers));
    }
}
