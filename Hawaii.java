public class Hawaii extends State {
    public Hawaii() { //this is the case for Hawaii
        setName("Hawaii");
        setTaxBehavior(new FourpointfivePercent());
    }

    @Override
    public void showTax(double value) {
        super.showTax(value);
    }
}
