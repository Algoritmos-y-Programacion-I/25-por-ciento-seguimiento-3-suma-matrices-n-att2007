package ui;

import java.util.Scanner;
import model.Controller;

public class Executable {
    private Controller cont; 
    private Scanner escaner; 

    public Executable() {
        cont = new Controller(); 
        escaner = new Scanner(System.in); 
    }

    public void run() {
        boolean continuar = true;
        while (continuar) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Insertar números en la matriz");
            System.out.println("2. Ver estado de la sala de cine");
            System.out.println("3. Reservar un asiento");
            System.out.println("4. Liberar un asiento");
            System.out.println("5. Salir");

            int opcion = escaner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Inserte los números de la matriz 1:");
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            System.out.print("Dato para fila " + i + " y columna " + j + ": ");
                            int valor = escaner.nextInt();
                            cont.getMatriz1().insertarValor(i, j, valor);
                        }
                    }
                    System.out.println("Matriz 1 actualizada:");
                    imprimirMatriz(cont.getMatriz1().getMatriz());
                    break;

                case 2:
                    System.out.println("Estado de la sala de cine:");
                    System.out.println(cont.mostrarSala());
                    break;

                case 3:
                    System.out.print("Ingrese la fila del asiento: ");
                    int fila = escaner.nextInt();
                    System.out.print("Ingrese el asiento en la fila: ");
                    int asiento = escaner.nextInt();
                    System.out.println(cont.comprarSilla(fila, asiento));
                    break;

                case 4:
                    System.out.print("Ingrese la fila del asiento: ");
                    fila = escaner.nextInt();
                    System.out.print("Ingrese el asiento en la fila: ");
                    asiento = escaner.nextInt();
                    System.out.println(cont.liberarSilla(fila, asiento));
                    break;

                case 5:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }
        escaner.close();
    }

    private void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Executable mainApp = new Executable();
        mainApp.run();
    }
}
