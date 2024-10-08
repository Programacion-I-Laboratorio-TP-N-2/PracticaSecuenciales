import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.print("¿Cuántas horas puedes dedicar al estudio al día? ");
        int horasDiarias = lectura.nextInt();

        System.out.print("Ingrese las materias separadas solo por coma: ");
        String materiasString = lectura.next();
        String[] materias = materiasString.split(",");

        int horasSemanalesPorMateria = horasDiarias * 7 / materias.length;
        int horasRestantes = horasDiarias * 7 % materias.length;

        System.out.println("Plan de estudio semanal:");
        for (int i = 0; i < materias.length; i++) {
            System.out.println("- " + materias[i] + ": " +
                    (horasSemanalesPorMateria + (i < horasRestantes ? 1 : 0)) + " horas");
        }
    }
}
