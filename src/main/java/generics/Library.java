/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import models.Media;

public class Library<T extends Media> {

    private List<T> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void add(final T item) {
        items.add(item);
    }

    public Optional<T> getItemsByName(final String name) {
        return items.stream()
                    .filter(item -> item.getName().equals(name))
                    .findFirst();
    }
}
