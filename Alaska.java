public class Alaska extends State {
    public Alaska() { //case for alaska, both are needed to follow the uml diagram and the strategy pattern that is required
        setName("Alaska");
        setTaxBehavior(new NoTax());
    }

    @Override
    public void showTax(double value) {
        super.showTax(value);
    }
}
