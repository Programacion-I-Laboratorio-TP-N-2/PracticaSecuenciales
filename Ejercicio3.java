import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("Selecciona tu nivel de condición física:");
        System.out.println("1. Principiante");
        System.out.println("2. Intermedio");
        System.out.println("3. Avanzado");
        int nivel = lectura.nextInt();

        String[][] rutinas = {
                {"Caminar 30 minutos", "Ejercicios de estiramiento", "Ejercicios de fuerza con peso corporal"}, // Principiante
                {"Correr 30 minutos", "Natación 60 minutos", "Entrenamiento de fuerza con pesas ligeras"}, // Intermedio
                {"Entrenamiento de alta intensidad", "Levantamiento de pesas", "Correr durante 90 minutos"} // Avanzado
        };

        System.out.println("Tu rutina semanal es:");
        for (String ejercicio : rutinas[nivel - 1]) {
            System.out.println("- " + ejercicio);
        }
    }
}
