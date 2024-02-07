import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca los números
        System.out.println("Introduce números enteros positivos (introduce un número negativo para finalizar):");

        int numero;
        int minimo = Integer.MAX_VALUE;
        int maximo = Integer.MIN_VALUE;

        while (true) {
            numero = scanner.nextInt();

            // Verificar si el número es negativo para finalizar la entrada
            if (numero < 0) {
                break;
            }

            // Actualizar el mínimo y el máximo
            if (numero < minimo) {
                minimo = numero;
            }
            if (numero > maximo) {
                maximo = numero;
            }
        }

        // Mostrar el mínimo y el máximo
        if (minimo == Integer.MAX_VALUE && maximo == Integer.MIN_VALUE) {
            System.out.println("No se introdujeron números positivos.");
        } else {
            System.out.println("El mínimo es: " + minimo);
            System.out.println("El máximo es: " + maximo);
        }

        scanner.close();
    }
}
