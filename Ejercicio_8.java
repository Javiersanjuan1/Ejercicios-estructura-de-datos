import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        int[] numeros = recibirNumeros();

        if (numeros.length == 0) {
            System.out.println("No se ingresaron números.");
            return;
        }

        double media = calcularMedia(numeros);
        int minimo = calcularMinimo(numeros);
        int maximo = calcularMaximo(numeros);

        System.out.println("La media de los números es: " + media);
        System.out.println("El mínimo de los números es: " + minimo);
        System.out.println("El máximo de los números es: " + maximo);
    }

    // Función para recibir N números enteros por teclado hasta que se introduce un 0
    public static int[] recibirNumeros() {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[100]; // Se asume que no se ingresarán más de 100 números
        int contador = 0;

        System.out.println("Introduce números enteros (introduce 0 para finalizar):");
        while (true) {
            int numero = scanner.nextInt();
            if (numero == 0) {
                break;
            }
            numeros[contador] = numero;
            contador++;
        }

        // Redimensionar el array para eliminar los espacios no utilizados
        int[] numerosReales = new int[contador];
        for (int i = 0; i < contador; i++) {
            numerosReales[i] = numeros[i];
        }

        return numerosReales;
    }

    // Función para calcular la media de los elementos de un array
    public static double calcularMedia(int[] array) {
        double suma = 0;
        for (int numero : array) {
            suma += numero;
        }
        return suma / array.length;
    }

    // Función para calcular el mínimo de los elementos de un array
    public static int calcularMinimo(int[] array) {
        int minimo = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimo) {
                minimo = array[i];
            }
        }
        return minimo;
    }

    // Función para calcular el máximo de los elementos de un array
    public static int calcularMaximo(int[] array) {
        int maximo = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximo) {
                maximo = array[i];
            }
        }
        return maximo;
    }
}
