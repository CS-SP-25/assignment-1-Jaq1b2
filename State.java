public abstract class State {
    private String name; //private vars
    private SalesTaxBehavior taxBehavior;

    public String getName() { //generic getter
        return name;
    }

    public void setName(String name) { //generic setter
        this.name = name;
    }

    public void showTax(double value) {
        double tax = taxBehavior.compute(value);
        System.out.printf("The sales tax on $%.2f in %s is $%.2f.%n", value, name, tax); //this is the output after the output is calculated
    }

    protected void setTaxBehavior(SalesTaxBehavior taxBehavior) { //another setter
        this.taxBehavior = taxBehavior;
    }
}
