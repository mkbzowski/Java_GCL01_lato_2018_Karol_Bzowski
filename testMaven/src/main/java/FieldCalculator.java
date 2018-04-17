public class FieldCalculator {

    public double calculateSquare(double a) {

        return a * a;

    }


    public double calculateCircle(double r) throws IllegalArgumentException {


            if (r <= 0) throw new IllegalArgumentException("Promien mniejszy lub rowny 0!");


        final double PI = 3.14;
        return PI * r * r;

    }

    public double calculateTriangle(double a, double h) {
        if (a < 0 || h <0) throw new IllegalArgumentException("boki musze byc nieujemne!");
        return (a * h) / 2;

    }

    public double calculateRectangle(double a, double b) throws IllegalArgumentException{
        if (a < 0 || b <0) throw new IllegalArgumentException("boki musze byc nieujemne!");
        return a * b;

    }
}
