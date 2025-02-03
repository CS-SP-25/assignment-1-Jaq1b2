import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StateTaxCalculatorTest {

    @Test
    void testNoTax() { //these are all very generic junit tests
        SalesTaxBehavior noTax = new NoTax();
        double result = noTax.compute(100.0);
        assertEquals(0.0, result, "NoTax should return 0.0");
    }

    @Test
    void testHawaiiTax(){
        SalesTaxBehavior FourpointfivePercent = new FourpointfivePercent();
        double result = FourpointfivePercent.compute(100);
        assertEquals(4.5, result, "four should return 4.5");
    }

    @Test
    void testSevenPercentTax() {
        SalesTaxBehavior sevenPercent = new SevenPercent();
        double result = sevenPercent.compute(100.0);
        assertEquals(7.0, result, 0.01, "SevenPercent should return 7% of the value");
    }

    @Test
    void testAlaskaState() {
        State alaska = new Alaska();
        assertEquals("Alaska", alaska.getName(), "Alaska state name should be set correctly");

        // Check tax computation
        double saleAmount = 100.0;
        alaska.showTax(saleAmount);
        // Alaska has no tax, so the sales tax should be 0.0
        assertDoesNotThrow(() -> alaska.showTax(saleAmount));
    }

    @Test
    void testIndianaState() {
        State indiana = new Indiana();
        assertEquals("Indiana", indiana.getName(), "Indiana state name should be set correctly");

        // Check tax computation
        double saleAmount = 100.0;
        indiana.showTax(saleAmount);
        SalesTaxBehavior sevenPercent = new SevenPercent();
        assertEquals(sevenPercent.compute(saleAmount), 7.0, 0.01, "Indiana should compute 7% sales tax");
    }

    @Test
    void testHawaiistate(){
        State Hawaii = new Hawaii();
        assertEquals("Hawaii", Hawaii.getName(), "Hawaii state name should be set correctly");

        double saleAmount = 100.0;
        Hawaii.showTax(saleAmount);

        SalesTaxBehavior fourpointfivePercent = new FourpointfivePercent();

        assertEquals(fourpointfivePercent.compute(saleAmount), 4.5, .01, "Hawaii should compute 4.5% sales tax");
    }
}
