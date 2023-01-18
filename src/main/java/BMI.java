public class BMI {

    private double hight;
    private double weight;

    public BMI(double hight, double weight) {
        this.hight = hight;
        this.weight = weight;
    }


    public double calculate() {
        return weight / (hight * hight);
    }

    public boolean isUnderWeight() {
        if (calculate() < 18.5) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isNormalWeight() {
        if (calculate() > 18.5 && calculate() < 25) {
        return true; }
        else {
            return false;
            }
    }

    public boolean isOverWeight() {
        if (calculate() > 25) {
        return true;
    }
        else {
            return false;
        }
    }
}
