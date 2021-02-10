package hw7;

public class PerformCalculation {

    /**
     * Perform the calculation based on the operation the user choose, return the result of
     * the calculation as a double.
     *
     * @param operation Operation the user choose, used to determine what case we should do.
     * @param a First number
     * @param b Second number
     * @return The result of the calculation
     */
    public static double PerformCalculationBasedOnOperation(String operation, double a, double b){

        double result = 0;

        switch (operation) {
            case "add":
                result = a + b;
                break;

            case "subtract":
                result = a - b;
                break;

            case "multiply":
                result = a * b;
                break;

            case "divide":
                result = a / b;
                break;

            case "reciprocal":
                result = 1/a;
                break;

            case "square":
                result = a*a;
                break;

            case "sqrt":
                result = Math.sqrt(a);
                break;

            default:
                result = 0;
        }
        return result;
    }

}
