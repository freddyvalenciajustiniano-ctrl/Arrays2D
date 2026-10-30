import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        System.out.print("numero de filas(n):");
        int n = llegir.nextInt();
        System.out.print("numero de columnas(m):");
        int m = llegir.nextInt();

        int[][] matriz = new int[n][m];
        int[][] resultado = new int[3][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = llegir.nextInt();
            }
        }
        for (int j = 0; j < m; j++) {
            int suma = 0;
            int max = matriz[0][j];
            int min = matriz[0][j];

            for (int i = 0; i < n; i++) {
                int valor = matriz[i][j];
                suma += valor;
                if (valor > max) {
                    max = valor;
                }
                if (valor < min) {
                    min = valor;
                }
            }

            resultado[0][j] = suma;
            resultado[1][j] = max;
            resultado[2][j] = min;
        }
        System.out.println("Matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        String[] etiquetas = {"Suma", "Máximo", "Mínimo"};
        System.out.println("Resultados por columna:");
        for (int k = 0; k < 3; k++) {
            System.out.print(etiquetas[k]);
            for (int j = 0; j < m; j++) {
                System.out.print(resultado[k][j]);
            }
            System.out.println();
        }

        llegir.close();


    }
}