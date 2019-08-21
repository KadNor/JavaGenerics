/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */

package models;

import com.sun.istack.internal.NotNull;

public class Video extends Media {

    public Video(@NotNull final String name) {
        super(name);
    }

    public String getInformation() {
        return String.format("Name: %s", name);
    }
}
