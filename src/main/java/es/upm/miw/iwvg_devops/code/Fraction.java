package es.upm.miw.iwvg_devops.code;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
    public boolean isProper() {
        return numerator < denominator;
    }

    public boolean isImproper() {
        return numerator > denominator;
    }

    public boolean isEquivalent(Fraction other) {
        return numerator * other.getDenominator() == denominator * other.getNumerator();
    }

    public Fraction add(Fraction other) {
        int commonDenominator = this.denominator * other.getDenominator();
        int sumNumerator = this.numerator * other.getDenominator() + other.getNumerator() * this.denominator;
        return new Fraction(sumNumerator, commonDenominator);
    }

    public Fraction multiply(Fraction other) {
        int productNumerator = this.numerator * other.getNumerator();
        int productDenominator = this.denominator * other.getDenominator();
        return new Fraction(productNumerator, productDenominator);
    }

    public Fraction divide(Fraction other) {
        int quotientNumerator = this.numerator * other.getDenominator();
        int quotientDenominator = this.denominator * other.getNumerator();
        return new Fraction(quotientNumerator, quotientDenominator);
    }
}
