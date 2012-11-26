package org.linesofcode.bht.pqm.csv;

import org.apache.commons.csv.CSVRecord;

public class StockEntry implements Comparable<StockEntry> {

    private String name;
    private Float difference;

    public StockEntry(CSVRecord record) {
        difference = Float.parseFloat(record.get(3)
                .replace('%', ' ')
                .replace('Ê', ' ')
                .replace(',', '.')
                .trim());
        name = record.get(1);
    }

    @Override
    public int compareTo(StockEntry o) {
        return getDifference().compareTo(o.getDifference());
    }

    public String getName() {
        return name;
    }

    public Float getDifference() {
        return difference;
    }
}
