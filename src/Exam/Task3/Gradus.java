package Exam.Task3;

public class Gradus {
    public static double g;

    public Gradus(double g) {

        Gradus.g = g;
    }

    static class Celsius implements Converter {
        @Override
        public void getConvertedValue() {
            double cel = g;
            System.out.println("Celsius: " + cel);
        }
    }

    static class Kelvin implements Converter {
        @Override
        public void getConvertedValue() {
            double kel = 1.8 * g + 32;
            System.out.println("Kelvin: " + kel);
        }
    }

    static class Fahrenheit implements Converter {
        @Override
        public void getConvertedValue() {
            double fah = g + 273.15;
            System.out.println("Fahrenheit: " + fah);
        }
    }

}
