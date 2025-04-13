package model;

public class MatrizNumerica {
    private int[][] matriz; // Declaro
    private int cantColumnas; // Solo conserva variables que realmente uses

    public MatrizNumerica(int filas, int columnas) {
        cantColumnas = columnas;
        this.matriz = new int[filas][columnas]; // Inicializo
    }

    public void insertarValor(int i, int j, int valor) {
        matriz[i][j] = valor;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public int getcantColumnas() {
        return cantColumnas;
    }
}
