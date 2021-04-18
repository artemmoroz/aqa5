public class Townhouse extends Flat{

    private int flatNumber;

    public int getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    @Override
    protected double getPayment(double S, int peopleCount) {
        return super.getPayment(S, peopleCount)*flatNumber;
    }
}
