import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    private int numberToFactor;
    private List<Integer> factors;
    private int divisor;


    public PrimeFactors(int numberToFactor) {
        this.numberToFactor = numberToFactor;
    }

    public static List<Integer> of(int numberToFactor) {
        return new PrimeFactors(numberToFactor).value();
    }

    private List<Integer> value() {
        initialize();
        addFactor();
        divisor = 3;
        while (canBeFactorized()) {
            addFactor();
            divisor = divisor +2;
        }

        return factors;
    }

    private boolean canBeFactorized () {
        return numberToFactor>1;
    }

    private void addFactor() {

        while (isDivisible()) {
            factors.add(divisor);
            reduceNumberToFactor();
        }
    }

    private boolean isDivisible(){
        return numberToFactor%divisor == 0;
    }

    private void reduceNumberToFactor() {
        numberToFactor/=divisor;
    }

    private void initialize () {
        factors = new ArrayList<Integer>();
        divisor = 2;
    }

}
