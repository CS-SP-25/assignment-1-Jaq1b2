public class SalesTaxCalculator {
    public static void main(String[] args) { //this is the main function and method
        if (args.length != 2) {
            System.out.println("Usage: java SalesTaxCalculator <state> <sale amount>");
            return;
        }

        String stateName = args[0];
        double saleAmount;

        try {
            saleAmount = Double.parseDouble(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid sale amount. Please enter a numeric value.");
            return;
        }

        State state;

        if (stateName.equalsIgnoreCase("Alaska")) { //this is basically scanning inputs and assigning proper outputs to use in calculation
            state = new Alaska();
        } else if (stateName.equalsIgnoreCase("Indiana")) {
            state = new Indiana();
        } else if (stateName.equalsIgnoreCase("Hawaii")){
            state = new Hawaii();
        }
        else {
            System.out.println("Invalid state name. Please enter 'Alaska' or 'Indiana', or 'Hawaii'.");
            return;
        }

        state.showTax(saleAmount);
    }
}
