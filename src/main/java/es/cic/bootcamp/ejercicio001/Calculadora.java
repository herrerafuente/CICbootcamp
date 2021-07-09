package es.cic.bootcamp.ejercicio001;

public class Calculadora {
	
	public int sumar(int s1, int s2) {
		return s1 + s2;
	}

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		System.out.println("Hola Mundo" + calculadora.sumar(4, 5));
	}
}
