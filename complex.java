import java.util.Scanner;

public class Complex {
    private double real;
    private double imaginary;

    // Constructor
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Getters and setters
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public Complex add(Complex num) {
        double realPart = this.real + num.real;
        double imagPart = this.imaginary + num.imaginary;
        return new Complex(realPart, imagPart);
    }

    // Method to subtract two complex numbers
    public Complex subtract(Complex num) {
        double realPart = this.real - num.real;
        double imagPart = this.imaginary - num.imaginary;
        return new Complex(realPart, imagPart);
    }

    // Method to multiply two complex numbers
    public Complex multiply(Complex num) {
        double realPart = (this.real * num.real) - (this.imaginary * num.imaginary);
        double imagPart = (this.real * num.imaginary) + (this.imaginary * num.real);
        return new Complex(realPart, imagPart);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Getting real and imaginary parts of first complex number
        System.out.println("Enter real and imaginary parts of first complex number:");
        double real1 = sc.nextDouble();
        double imag1 = sc.nextDouble();
        Complex num1 = new Complex(real1, imag1);

        // Getting real and imaginary parts of second complex number
        System.out.println("Enter real and imaginary parts of second complex number:");
        double real2 = sc.nextDouble();
        double imag2 = sc.nextDouble();
        Complex num2 = new Complex(real2, imag2);

        // Performing addition, subtraction, and multiplication
        Complex sum = num1.add(num2);
        Complex diff = num1.subtract(num2);
        Complex prod = num1.multiply(num2);

        // Printing the results
        System.out.println("Sum: " + sum.getReal() + " + " + sum.getImaginary() + "i");
        System.out.println("Difference: " + diff.getReal() + " + " + diff.getImaginary() + "i");
        System.out.println("Product: " + prod.getReal() + " + " + prod.getImaginary() + "i");

        sc.close();
    }
}
