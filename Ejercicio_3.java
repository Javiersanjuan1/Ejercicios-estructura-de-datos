import java.util.ArrayList;

public class Ejercicio_3 {
    public static void main(String[] args) {
        int begin = 1;
        int end = 100;

        // Obtener los múltiplos de 5 entre begin y end
        int[] multiplosDe5 = obtenerMultiplosDe5(begin, end);

        // Calcular la suma de los múltiplos de 5
        int sumaMultiplosDe5 = calcularSuma(multiplosDe5);

        // Mostrar la suma de los múltiplos de 5
        System.out.println("La suma de todos los múltiplos de 5 entre 1 y 100 es: " + sumaMultiplosDe5);

        // Mostrar cuántos múltiplos de 5 hay y visualizar cada uno de ellos
        System.out.println("Cantidad de múltiplos de 5 encontrados: " + multiplosDe5.length);
        System.out.println("Los múltiplos de 5 son:");
        for (int multiplo : multiplosDe5) {
            System.out.print(multiplo + " ");
        }
    }

    // Función para obtener los múltiplos de 5 entre begin y end
    public static int[] obtenerMultiplosDe5(int begin, int end) {
        ArrayList<Integer> multiplos = new ArrayList<>();

        for (int i = begin; i <= end; i++) {
            if (i % 5 == 0) {
                multiplos.add(i);
            }
        }

        // Convertir ArrayList a array de enteros
        int[] multiplosArray = new int[multiplos.size()];
        for (int i = 0; i < multiplos.size(); i++) {
            multiplosArray[i] = multiplos.get(i);
        }

        return multiplosArray;
    }

    // Función para calcular la suma de los valores en un array
    public static int calcularSuma(int[] array) {
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        return suma;
    }
}
