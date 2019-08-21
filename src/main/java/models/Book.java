/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */

package models;

import com.sun.istack.internal.NotNull;

public class Book extends Media {

    private String author;

    public Book(@NotNull final String name, @NotNull final String author) {
        super(name);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(final String author) {
        this.author = author;
    }

    public String getInformation() {
        return String.format("Name: %s, Author: %s", name, author);
    }
}
