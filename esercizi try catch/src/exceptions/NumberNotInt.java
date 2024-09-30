package exceptions;

public class NumberNotInt extends RuntimeException {
    public NumberNotInt(double numb) {
        super("Il numero " + numb + " che hai inserito NON è intero !!");
    }
}
