public class Ejercicio_5 {
    public static void main(String[] args) {
        // Definimos el número de tablas que queremos generar
        int n = 10;

        // Generamos las tablas de multiplicar
        int[][] tablas = generarTablasDeMultiplicar(n);

        // Visualizamos las tablas de multiplicar
        visualizarTablasDeMultiplicar(tablas);
    }

    // Función para generar las tablas de multiplicar de los N primeros números naturales
    public static int[][] generarTablasDeMultiplicar(int n) {
        int[][] tablas = new int[n][10];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 10; j++) {
                tablas[i][j] = i * j;
            }
        }

        return tablas;
    }

    // Función para visualizar las tablas de multiplicar
    public static void visualizarTablasDeMultiplicar(int[][] tablas) {
        for (int i = 0; i < tablas.length; i++) {
            System.out.println("Tabla de multiplicar del " + i + ":");
            for (int j = 0; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + tablas[i][j]);
            }
            System.out.println(); // Agrega una línea en blanco para separar las tablas
        }
    }
}
