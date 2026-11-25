public class Fraction
{
    private int numerator;
    private int denominator;

    public Fraction()
    {
        numerator = (int)(Math.random() * 9) + 1;
        denominator = (int)(Math.random() * 9) + 1;
    }

    public Fraction(int n, int d)
    {
        numerator = n;
        denominator = d;
    }

    public Fraction(String s)
    {
        int slash = s.indexOf("/");

        numerator = Integer.parseInt(s.substring(0, slash));
        denominator = Integer.parseInt(s.substring(slash + 1));
    }

    public int getNumerator()
    {
        return numerator;
    }

    public int getDenominator()
    {
        return denominator;
    }

    public void setNumerator(int n)
    {
        numerator = n;
    }

    public void setDenominator(int d)
    {
        denominator = d;
    }

    public double toDouble()
    {
        return (double) numerator / denominator;
    }

    public String toString()
    {
        return numerator + "/" + denominator;
    }

    private int gcd(int a, int b)
    {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public void reduce()
    {
        int divisor = gcd(numerator, denominator);

        numerator /= divisor;
        denominator /= divisor;

        if (denominator < 0)
        {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    // Addition
    public Fraction add(Fraction f)
    {
        int n = numerator * f.denominator + denominator * f.numerator;
		int d = denominator * f.denominator;
		Fraction result = new Fraction(n, d);
        result.reduce();
        return result;
    }

    // Subtraction
    public Fraction subtract(Fraction f)
    {
        int n = numerator * f.denominator - denominator * f.numerator;
		int d = denominator * f.denominator;
		Fraction result = new Fraction(n, d);
        result.reduce();
		return result;
    }

    // Multiplication
    public Fraction multiply(Fraction f)
    {
        int n = numerator * f.numerator;
        int d = denominator * f.denominator;
		Fraction result = new Fraction(n, d);
        result.reduce();
		return result;
    }

    // Division
    public Fraction divide(Fraction f)
    {
        int n = numerator * f.denominator;
        int d = denominator * f.numerator;
		Fraction result = new Fraction(n, d);
        result.reduce();
		return result;
    }

    public boolean equals(Fraction f)
    {
        return numerator == f.numerator && denominator == f.denominator;
    }
}
