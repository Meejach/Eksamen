public class DateAgeCalculator {

    private int yourAge;
    private int dateAge;

    public static void main(String[] args) {
        DateAgeCalculator calculator = new DateAgeCalculator(24, 23);
        System.out.println(calculator.beregning());
    }

    public DateAgeCalculator(int yourAge, int dateAge) {
        this.yourAge = yourAge;
        this.dateAge = dateAge;
    }

    public int beregning () {
        return yourAge/2+7;
    }

    public boolean forUng() {
        if(dateAge < beregning()) {
            System.out.println("Dsv du er for ung til at date! ");
            return true;
        }
        return false;
    }
}
