import javax.swing.JOptionPane;
import Model.Estudiante;

public class Actividad_individual_3_promedio {
    public static void main(String[] args) {
        Estudiante[] estudiantes = {
            new Estudiante("Chuy", "001"),
            new Estudiante("Airam", "002"),
            new Estudiante("David", "003"),
            new Estudiante("Luisa", "004"),
            new Estudiante("Aldo", "005")
        };


        for (Estudiante estudiante : estudiantes) {
            for (int i = 0; i < 5; i++) {
                String input;
                double nota = -1;
                while (nota < 0 || nota > 100) {
                    input = JOptionPane.showInputDialog("Ingrese la nota " + (i + 1) + " para " + estudiante.getNombre() + ":");
                    if (input == null) return; 
                    nota = convertirNota(input);
                }
                estudiante.setNota(i, nota);
            }
        }


        System.out.println("Promedios:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("Matrícula: " + estudiante.getMatricula());
            System.out.println("Calificación: " + estudiante.calcularPromedio());
            System.out.println("El estudiante está aprobado?: " + (estudiante.aprobado() ? "Sí" : "No"));

        }
    }

    private static double convertirNota(String input) {
        if (input.matches("\\d+(\\.\\d+)?")) { 
            return Double.parseDouble(input);
        }
        return -1;
    }
}

