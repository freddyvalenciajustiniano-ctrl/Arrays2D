import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        System.out.print("numero de filas(n):");
        int n = llegir.nextInt();
        System.out.print("numero de columnas(m):");
        int m = llegir.nextInt();

        int[][] matriz = new int[n][m];
        int[] sumas = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("nombres [" + i + "][" + j + "]: ");
                matriz[i][j] = llegir.nextInt();
            }
        }
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                sumas[j] += matriz[i][j];
            }
        }
        System.out.println("matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println("Suma de cada columna:");
        for (int j = 0; j < m; j++) {
            System.out.println("Columna " + j + ": " + sumas[j]);
        }

        llegir.close();
    }
}