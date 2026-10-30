public class Main3 {
    public static void main(String[] args) {
        char[][] matriz = new char[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j || i + j == 4) {
                    matriz[i][j] = 'X';
                } else {
                    matriz[i][j] = ' ';
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}