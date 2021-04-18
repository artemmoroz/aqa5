public class Flat {
    protected double s;
    protected int peopleCount;

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }
    protected double getPayment (double s, int peopleCount){
        double payment;
        return payment = 10*s*peopleCount;
    }

}
