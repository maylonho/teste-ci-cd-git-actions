package br.com.oliveira;

public class SimpleMath {
	public Double sum(Double numberOne, Double numberTwo) {
		return numberOne + numberTwo;
	}

	public Double subtraction(Double numberOne, Double numberTwo) {
		return numberOne - numberTwo;
	}

	public Double multiplication(Double numberOne, Double numberTwo) {
		return numberOne * numberTwo;
	}

	public double division(double first, double second) {
	    if (second == 0.0) {
	        throw new ArithmeticException("Impossible to divide by zero!");
	    }
	    return first / second;
	}


	public Double mean(Double numberOne, Double numberTwo) {
		return (numberOne + numberTwo) / 2;
	}

	public Double squareRoot(Double number) {
		return Math.sqrt(number);
	}
}
