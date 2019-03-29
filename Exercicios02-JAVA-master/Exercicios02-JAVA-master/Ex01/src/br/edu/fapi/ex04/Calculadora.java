package br.edu.fapi.ex04;

public class Calculadora {

	public void calcular(int operacao, float num1, float num2) {

		switch (operacao) {
		case 1:
			Soma soma = new Soma();
			float resultado = soma.calcularSoma(num1, num2);
			System.out.println(resultado);
			break;

		}
	}
}
