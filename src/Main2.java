public class Main2 {
    public static void main(String[] args) {
        char[][] matriz = new char[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4 || i == j) {
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