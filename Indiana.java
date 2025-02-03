public class Indiana extends State {
    public Indiana() { //this is the case for indiana
        setName("Indiana");
        setTaxBehavior(new SevenPercent());
    }

    @Override
    public void showTax(double value) {
        super.showTax(value);
    }
}
