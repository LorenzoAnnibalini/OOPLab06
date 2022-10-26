package it.unibo.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

/**
 * Example class using {@link List} and {@link Map}.
 *
 */
public final class UseListsAndMaps {
    private final static int ELEMS = 100000;
    private static final long AFRICA = 1_110_635_000L;
    private static final long AMERICAS = 972_005_000L;
    private static final long ANTARCTICA = 0L;
    private static final long ASIA= 4_298_723_000L;
    private static final long EUROPE = 742_452_000L;
    private static final long OCEANIA = 38_304_000L;

    private UseListsAndMaps() {
    }

    /**
     * @param s
     *            unused
     */
    public static void main(final String... s) {
        /*
         * 1) Create a new ArrayList<Integer>, and populate it with the numbers
         * from 1000 (included) to 2000 (excluded).
         */
        final ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i=1000;i<2000;i++) {
            array.add(i);
        }
        /*
         * 2) Create a new LinkedList<Integer> and, in a single line of code
         * without using any looping construct (for, while), populate it with
         * the same contents of the list of point 1.
         */
        final LinkedList<Integer> list = new LinkedList<Integer>(array);
        /*
         * 3) Using "set" and "get" and "size" methods, swap the first and last
         * element of the first list. You can not use any "magic number".
         * (Suggestion: use a temporary variable)
         */
        final int tmp = list.getFirst();
        list.set(0, list.getLast());
        list.set(999, tmp);
        /*
         * 4) Using a single for-each, print the contents of the arraylist.
         */
        for (int j : list) {
            System.out.println(j);
        }
        /*
         * 5) Measure the performance of inserting new elements in the head of
         * the collection: measure the time required to add 100.000 elements as
         * first element of the collection for both ArrayList and LinkedList,
         * using the previous lists. In order to measure times, use as example
         * TestPerformance.java.
         */
        long time = System.nanoTime();
        for (int i = 1; i <= ELEMS; i++) {
            array.add(i);
        }
        time = System.nanoTime() - time;
        final var millis = TimeUnit.NANOSECONDS.toMillis(time);
        System.out.println("ArrayList ------");
        System.out.println(
            "Converting "
                + array.size()
                + " ints to String and inserting them in a ArrayList took "
                + time
                + "ns ("
                + millis
                + "ms)"
        );
        time = System.nanoTime();
        for (int i = 1; i <= ELEMS; i++) {
            list.add(i);
        }
        time = System.nanoTime() - time;
        final var millis2 = TimeUnit.NANOSECONDS.toMillis(time);
        System.out.println("LinkedList ------");
        System.out.println(
            "Converting "
                + list.size()
                + " ints to String and inserting them in a LinkedList took "
                + time
                + "ns ("
                + millis2
                + "ms)"
        );
        /*
         * 6) Measure the performance of reading 1000 times an element whose
         * position is in the middle of the collection for both ArrayList and
         * LinkedList, using the collections of point 5. In order to measure
         * times, use as example PerfTest.java.
         */
        time = System.nanoTime();
        int tmpget;
        for (int i = 1; i <= ELEMS; i++) {
            tmpget = array.get((array.size())/2);
        }
        time = System.nanoTime() - time;
        final var millis3 = TimeUnit.NANOSECONDS.toMillis(time);
        System.out.println("ArrayList ------");
        System.out.println(
            "Converting "
                + array.size()
                + " ints to String and search them in a ArrayList took "
                + time
                + "ns ("
                + millis3
                + "ms)"
        );
        time = System.nanoTime();
        for (int i = 1; i <= ELEMS; i++) {
            tmpget=list.get((list.size())/2);
        }
        time = System.nanoTime() - time;
        final var millis4 = TimeUnit.NANOSECONDS.toMillis(time);
        System.out.println("LinkedList ------");
        System.out.println(
            "Converting "
                + list.size()
                + " ints to String and Serach them in a Sthe LinkedList took "
                + time
                + "ns ("
                + millis4
                + "ms)"
        );

        /*
         * 7) Build a new Map that associates to each continent's name its
         * population:
         *
         * Africa -> 1,110,635,000
         *
         * Americas -> 972,005,000
         *
         * Antarctica -> 0
         *
         * Asia -> 4,298,723,000
         *
         * Europe -> 742,452,000
         *
         * Oceania -> 38,304,000
         */
        final Map<String, Long> mappa = new TreeMap<>();
        mappa.put("Africa", AFRICA);
        mappa.put("Americas", AMERICAS);
        mappa.put("Antartica", ANTARCTICA);
        mappa.put("Asia", ASIA);
        mappa.put("Europe", EUROPE);
        mappa.put("Oceania", OCEANIA);

        /*
         * 8) Compute the population of the world
         */
    }
}
