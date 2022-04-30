package Exam.Task3;

public class ConverterMain {
    public static void main(String[] args) {
        Gradus num = new Gradus(36.6);

        Gradus.Celsius c = new Gradus.Celsius();
        Gradus.Kelvin k = new Gradus.Kelvin();
        Gradus.Fahrenheit f = new Gradus.Fahrenheit();

        c.getConvertedValue();
        k.getConvertedValue();
        f.getConvertedValue();
    }
}
