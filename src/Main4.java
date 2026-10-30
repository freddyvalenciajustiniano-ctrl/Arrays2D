import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        // Ingresamos las 3 notas de cada alumno

        Scanner llegir = new Scanner(System.in);
        int alumnos = 20;
        double[][] notas = new double[alumnos][6];

        for (int i = 0; i < alumnos; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Alumno " + (i + 1) + ", nota " + (j + 1) + ": ");
                notas[i][j] = llegir.nextDouble();
            }
        }

        // Calculamos promedio, máxima y mínima de cada alumno. REPASAR!

        for (int i = 0; i < alumnos; i++) {
            double suma = 0;
            double max = notas[i][0];
            double min = notas[i][0];

            for (int j = 0; j < 3; j++) {
                suma += notas[i][j];
                if (notas[i][j] > max) max = notas[i][j];
                if (notas[i][j] < min) min = notas[i][j];
            }

            notas[i][3] = suma / 3;
            notas[i][4] = max;
            notas[i][5] = min;
        }

        // Imprimir la matriz. Repasar!!!!

        System.out.println("N1" + "\t" + "N2" + "\t" + "N3" + "\t" + "Prom" + "\t" + "Max" + "\t" + "Min");
        for (int i = 0; i < alumnos; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.printf("%.1f\t", notas[i][j]);
            }
            System.out.println();
        }

        // Mejor y peor nota del curso

        double mejor = notas[0][4];
        double peor = notas[0][5];
        for (int i = 1; i < alumnos; i++) {
            if (notas[i][4] > mejor) mejor = notas[i][4];
            if (notas[i][5] < peor) peor = notas[i][5];
        }

        // Imprimir la mejor y peor nota

        System.out.println("Mejor nota del curso: " + mejor);
        System.out.println("Peor nota del curso: " + peor);

        llegir.close();
    }
}