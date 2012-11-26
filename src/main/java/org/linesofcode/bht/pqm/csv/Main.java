package org.linesofcode.bht.pqm.csv;

import java.io.IOException;

/**
 * @author Dominik Eckelmann
 */
public class Main {

    public static void main(final String[] args) throws IOException {
        final StockIndex index = new StockIndex();

        System.out.println("Top5");
        for (final StockEntry entry : index.getTop(5)) {
            System.out.printf("%-15s %.2f%%\n", entry.getName(), entry.getDifference());
        }

        System.out.print("\nFlop5\n");
        for (final StockEntry entry : index.getFlop(5)) {
            System.out.printf("%-15s %.2f%%\n", entry.getName(), entry.getDifference());
        }

    }

}
