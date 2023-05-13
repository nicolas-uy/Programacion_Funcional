package imc;

public class IndiceMasaCorporal {

	public static void ejercicio1() {
		// Calculando el IMC de una persona que pesa 44 kg y mide 1.50 m
		CalculadoraIMC calc = (peso, altura) -> peso / (altura * altura);
		double valorImc = calc.calcularValor(44, 1.5);
		System.out.println("\tI.M.C.: " + valorImc);
	}

	public static void ejercicio2() {
		// Calculando el peso de una persona con un IMC de 19.56 y un peso de 44 kg
		CalculadoraIMC calc = (imc, altura) -> imc * (altura * altura);
		double peso = calc.calcularValor(19.555555555555557, 1.5);
		System.out.println("\tPeso: " + peso);
	}

}