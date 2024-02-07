import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer un número entero desde el teclado
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        // Calcular los factores primos del número ingresado
        ArrayList<Integer> factoresPrimos = calcularFactoresPrimos(numero);

        // Imprimir los factores primos
        System.out.print("Los factores primos de " + numero + " son: ");
        for (int factor : factoresPrimos) {
            System.out.print(factor + " ");
        }

        scanner.close();
    }

    // Función para calcular los factores primos de un número
    public static ArrayList<Integer> calcularFactoresPrimos(int numero) {
        ArrayList<Integer> factoresPrimos = new ArrayList<>();

        // Dividir el número por los números primos
        for (int divisor = 2; divisor <= numero; divisor++) {
            while (numero % divisor == 0) {
                factoresPrimos.add(divisor);
                numero /= divisor;
            }
        }

        return factoresPrimos;
    }
}
