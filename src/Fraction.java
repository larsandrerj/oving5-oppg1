public class Fraction {
    private final double numerator;

    private final double denominator;

    private double result;

    public Fraction(double numerator, double denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Kan ikke ha nevner lik 0");
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    public Fraction(double numerator) {
        this.numerator = numerator;
        this.denominator = 1.0;
    }

    private String getFraction() {
        return this.numerator + "/" + this.denominator;
    }

    public double getResult() {
        return this.result;
    }

    private void sum(double numerator, double denominator) {
        this.result = (this.numerator / this.denominator) + (numerator / denominator);
    }

    private void sub(double numerator, double denominator) {
        this.result = (this.numerator / this.denominator) - (numerator / denominator);
    }
    private void mul(double numerator, double denominator) {
        this.result = (this.numerator / this.denominator) * (numerator / denominator);
    }
    private void div(double numerator, double denominator) {
        this.result = (this.numerator / this.denominator) / (numerator / denominator);
    }

    public double getNumerator() {
        return numerator;
    }

    public double getDenominator() {
        return denominator;
    }

    public void testClient() {
        System.out.println("TESTCLIENT");
        double numerator = 1;
        double denominator = 2;

        System.out.println(this.getFraction());

        System.out.println(numerator + "/" + denominator);

        this.sum(numerator, denominator);
        System.out.println("sum");
        System.out.println(this.getResult());

        this.sub(numerator, denominator);
        System.out.println("sub");
        System.out.println(this.getResult());

        this.mul(numerator, denominator);
        System.out.println("mul");
        System.out.println(this.getResult());

        this.div(numerator, denominator);
        System.out.println("div");
        System.out.println(this.getResult());
    }

}
