public class SevenPercent implements SalesTaxBehavior {
    @Override
    public double compute(double value) { //calculates 7 percent tax
        return value * 0.07;
    }
}
