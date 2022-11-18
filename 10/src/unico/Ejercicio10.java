package unico;

public class Ejercicio10 {

	public static void main(String[] args) {

		/*
		 * Implementar un método que calcule la raíz cuadrada de un número por
		 * aproximaciones. La función debe recibir un número y devolver el resultado.
		 * Luego tras la llamada, debemos mostrar el resultado, y si descubrimos que no
		 * es exacto, debemos calcular el resto y mostrarlo.
		 */

		int num;
		int raiz;
		int resto;
		String mensaje; 
		
		num = Util.leerInt("Introduzca un número entero: ");
		raiz = raizCuadrada(num);
		
		if (raiz*raiz == num) {
			mensaje = "La raiz del número es " + raiz;
		} else {
			resto = num - (raiz*raiz);
			mensaje = "La raiz del número es " + raiz + " y el resto es " + resto;
		}
		
		Util.escribir(mensaje);
	}

	public static int raizCuadrada(int n) {
		int raiz = 0;
		for (int i = 1; i * i <= n; i++) {
			raiz = i;
		}
		return raiz;
	}
}
