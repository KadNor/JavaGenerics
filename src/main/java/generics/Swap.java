/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */

package generics;

public class Swap {

    /**
     * Swap two elements in an array.
     *
     * @param array the array which hosts the swapping process
     * @param i     the index of one element to be swapped
     * @param j     the index of the other element to be swapped
     * @param <T>   the type of the array elements.
     * @throws IndexOutOfBoundsException if either of the indices are below 0 or over the arrays size.
     */
    public static <T> void swapElements(final T[] array, final int i, final int j) {
        T swap = array[i];
        array[i] = array[j];
        array[j] = swap;
    }
}
