import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {

    @Test
    void getLiquidType() {
        Cup c = new Cup ("Wine", 85.5);
        assertEquals("Wine", c.getLiquidType());
    }

    @Test
    void getPercentFull() {
        Cup c = new Cup ("Wine", 85.5);
        assertEquals(85.5, c.getPercentFull(), 0.001);
    }

    @Test
    void setLiquidType() {
        Cup c = new Cup ("Wine", 85.5);
        c.setLiquidType("Water");
        assertEquals("Water", c.getLiquidType());
    }

    @Test
    void setPercentFull() {
        Cup c = new Cup ("Water", 85.5);
        c.setPercentFull(90.8);
        assertEquals(90.8, c.getPercentFull(), 0.001);
    }
}