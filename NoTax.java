public class NoTax implements SalesTaxBehavior {
    @Override
    public double compute(double value) { //literally just returns no tax
        return 0.0;
    }
}
