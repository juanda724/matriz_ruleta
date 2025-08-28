public class RotadorMatrices {
    
    public static int[][] rotarDerecha(int[][] matriz) {
        int n = matriz.length;
        int[][] resultado = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultado[j][n - 1 - i] = matriz[i][j];
            }
        }
        return resultado;
    }
    
    public static int[][] rotarIzquierda(int[][] matriz) {
        int n = matriz.length;
        int[][] resultado = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultado[n - 1 - j][i] = matriz[i][j];
            }
        }
        return resultado;
    }
    
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Matriz original:");
        imprimirMatriz(matriz);
        
        System.out.println("Matriz rotada en 90° por la derecha:");
        imprimirMatriz(rotarDerecha(matriz));
        
        System.out.println("Matriz rotada en 90° por la izquierda:");
        imprimirMatriz(rotarIzquierda(matriz));
    }
}
