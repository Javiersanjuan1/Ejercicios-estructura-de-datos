public class Ejercicio_1 {
    public static void main(String[] args) {
        // Definir las variables
        int diasEnUnAnio = 365;
        int horasEnUnDia = 24;
        int minutosEnUnaHora = 60;
        int segundosEnUnMinuto = 60;

        // Calcular el número total de segundos en un año
        long segundosEnUnAnio = calcularSegundos(diasEnUnAnio, horasEnUnDia, minutosEnUnaHora, segundosEnUnMinuto);

        // Mostrar el resultado
        System.out.println("El número de segundos en un año es: " + segundosEnUnAnio);
    }

    // Función para calcular el número de segundos en los días, horas, minutos y segundos
    public static long calcularSegundos(int dias, int horas, int minutos, int segundos) {
        // Calcular el total de segundos
        long totalSegundos = (long) dias * horas * minutos * segundos;

        return totalSegundos;
    }
}
