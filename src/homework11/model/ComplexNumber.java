package homework11.model;

public class ComplexNumber {
    private final Double real;
    private final Double imaginary;

    public ComplexNumber(Double real, Double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        return "ComplexNumber{" +
                "real=" + real +
                ", imaginary=" + imaginary +
                '}';
    }

    public Double getReal() {
        return real;
    }

    public Double getImaginary() {
        return imaginary;
    }

    public ComplexNumber add(ComplexNumber complexNumber) {
        return new ComplexNumber(real + complexNumber.getReal(), imaginary + complexNumber.getImaginary());
    }

    public ComplexNumber multiply(ComplexNumber complexNumber) {
        return new ComplexNumber(real * complexNumber.getReal() - imaginary * complexNumber.getImaginary(), real * complexNumber.getImaginary() + imaginary * complexNumber.getReal());
    }
}
