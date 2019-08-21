/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */

package oldSchool;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import models.Media;

public class Library {

    private List items;

    public Library() {
        items = new ArrayList();
    }

    public void add(final Media media) {
        items.add(media);
    }

    public Optional<Media> getItemByName(final String name) {
        return items.stream()
                    .map(item -> ((Media) item))
                    .filter(item -> ((Media) item).getName().equals(name))
                    .findFirst();
    }
}
