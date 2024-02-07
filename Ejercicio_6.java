import java.util.ArrayList;

public class Ejercicio_6 {
    public static void main(String[] args) {
        int N = 20; // Definimos cuántos números primos queremos encontrar

        // Llamamos a la función para obtener los N primeros números primos
        int[] primerosPrimos = obtenerPrimerosPrimos(N);

        // Mostramos los N primeros números primos
        System.out.println("Los primeros " + N + " números primos son:");
        for (int primo : primerosPrimos) {
            System.out.print(primo + " ");
        }
    }

    // Función para obtener los N primeros números primos
    public static int[] obtenerPrimerosPrimos(int N) {
        ArrayList<Integer> primos = new ArrayList<>();
        int numero = 2; // Empezamos con el primer número primo

        while (primos.size() < N) {
            if (esPrimo(numero)) {
                primos.add(numero);
            }
            numero++;
        }

        // Convertir ArrayList a array de enteros
        int[] arrayPrimos = new int[primos.size()];
        for (int i = 0; i < primos.size(); i++) {
            arrayPrimos[i] = primos.get(i);
        }

        return arrayPrimos;
    }

    // Función para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
