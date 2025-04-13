package model;

public class Controller {
    private SalaCine cinemark;
    private MatrizNumerica matriz1;
    private MatrizNumerica matriz2;

    public Controller() {
        matriz1 = new MatrizNumerica(2, 2);
        matriz2 = new MatrizNumerica(2, 2);
        inicialiceSala();
    }

    public void inicialiceSala() {
        cinemark = new SalaCine(7, 7);
    }

    public String mostrarSala() {
        if (cinemark != null) {
            return cinemark.toString();
        } else {
            return "La sala de cine no está inicializada.";
        }
    }

    public String comprarSilla(int fila, int asientoEnFila) {
        return cinemark.reservarAsiento(fila, asientoEnFila);
    }

    public String liberarSilla(int fila, int asientoEnFila) {
        return cinemark.liberarAsiento(fila, asientoEnFila);
    }

    public MatrizNumerica getMatriz1() {
        return matriz1;
    }

    public MatrizNumerica getMatriz2() {
        return matriz2;
    }
}

