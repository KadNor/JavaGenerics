/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */

package models;

import com.sun.istack.internal.NotNull;
import java.util.Date;

public class Newspaper extends Media {

    private Date releaseDate;

    public Newspaper(@NotNull final String name, @NotNull final Date releaseDate) {
        super(name);
        this.releaseDate = (Date) releaseDate.clone();
    }

    public Date getReleaseDate() {
        return (Date) releaseDate.clone();
    }

    public void setReleaseDate(final Date releaseDate) {
        this.releaseDate = (Date) releaseDate.clone();
    }

    public String getInformation() {
        return String.format("Name: %s, Release date: %s", name, releaseDate);
    }
}
