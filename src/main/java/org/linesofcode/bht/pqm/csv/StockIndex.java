package org.linesofcode.bht.pqm.csv;

import com.google.common.collect.Lists;
import com.google.common.io.Resources;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

public class StockIndex {

    private StockEntry[] entries;

    public StockIndex() throws IOException {
        final CSVFormat format = CSVFormat.newBuilder(CSVFormat.DEFAULT)
                .withDelimiter(';')
                .withQuoteChar('"')
                .withRecordSeparator('\n').build();

        final CSVParser parser = new CSVParser(
                IOUtils.toString(Resources.getResource("Dax30-Table.csv"), Charset.forName("ISO-8859-15")),
                format);

        final List<StockEntry> entries = Lists.newArrayList();
        for (final CSVRecord record : parser) {
            entries.add(new StockEntry(record));
        }
        this.entries = new StockEntry[entries.size()];
        this.entries = entries.toArray(this.entries);

    }

    public StockEntry[] getTop(final int size) {
        Arrays.sort(entries);
        ArrayUtils.reverse(entries);
        return Arrays.copyOf(entries, size);
    }

    public StockEntry[] getFlop(final int size) {
        Arrays.sort(entries);
        return Arrays.copyOf(entries, size);
    }
}
