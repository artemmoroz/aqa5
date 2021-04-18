public class Apartments extends Flat{

    private int flatNumber;

    public int getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    @Override
    protected double getPayment(double s, int peopleCount) {
        return super.getPayment(s, peopleCount)*flatNumber;
    }
}
