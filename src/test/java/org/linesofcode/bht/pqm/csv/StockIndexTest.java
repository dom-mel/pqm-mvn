package org.linesofcode.bht.pqm.csv;

import com.google.common.io.Resources;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class StockIndexTest {

    @Test
    public void testCSVPresent() {
        Resources.getResource("Dax30-Table.csv");
    }

    @Test
    public void testFlop() throws IOException {
        StockIndex index = new StockIndex();
        Assert.assertEquals(new Float(-0.67f), index.getFlop(1)[0].getDifference());
    }

    @Test
    public void testTop() throws IOException {
        StockIndex index = new StockIndex();
        Assert.assertEquals(new Float(2.58f), index.getTop(1)[0].getDifference());
    }


}
