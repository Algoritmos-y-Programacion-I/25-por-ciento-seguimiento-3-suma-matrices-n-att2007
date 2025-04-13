package model;

public class SalaCine {
    private boolean[][] asientos;

    public SalaCine(int filas, int asientosPorFila) {
        this.asientos = new boolean[filas][asientosPorFila];
        poblarSala();
    }

    public void poblarSala() {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                asientos[i][j] = false;
            }
        }
    }

    public String reservarAsiento(int fila, int asiento) {
        if (fila < 0 || fila >= asientos.length || asiento < 0 || asiento >= asientos[fila].length) {
            return "Error: Índices fuera de rango.";
        }

        if (!asientos[fila][asiento]) {
            asientos[fila][asiento] = true;
            return "Asiento reservado exitosamente.";
        } else {
            return "Asiento ya está reservado.";
        }
    }

    public String liberarAsiento(int fila, int asiento) {
        if (fila < 0 || fila >= asientos.length || asiento < 0 || asiento >= asientos[fila].length) {
            return "Error: Índices fuera de rango.";
        }

        if (asientos[fila][asiento]) {
            asientos[fila][asiento] = false;
            return "Asiento liberado exitosamente.";
        } else {
            return "El asiento ya está disponible.";
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                sb.append(asientos[i][j] ? "[X]" : "[ ]");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}


