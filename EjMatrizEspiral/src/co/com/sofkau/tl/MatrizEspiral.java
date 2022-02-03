package co.com.sofkau.tl;

import java.util.Scanner;

public class MatrizEspiral {
    // TODO: 2/02/2022 método para recorrer fila izq-der
    // TODO: 2/02/2022 método para recorrer fila der-izq
    // TODO: 2/02/2022 método para recorrer columna desc
    // TODO: 2/02/2022 método para recorrer columna asc
    // TODO: 2/02/2022 método para solicitar tamaño de matriz a llenar
    // TODO: 2/02/2022 método para imprimir la matriz
    // TODO: 2/02/2022 método para integrar todas las funcionalidades anteriores por medio de un menú que se comunique con el usuario

    // parámetros: matriz, nro fila o columna, el nro en el que comienza
    // parámetros: matriz, nro fila o columna, el nro en el que comienza
    /**
     * Código realizado por Carlos Fernando Rojas Cortes, Lina María Guerreo y Mauricio Zapata
     * Fecha: 2022/02/02 (YYYY/MM/DD)
     */
    static int[][] matriz;
    static int tamano, valorInicial;
    public static void pedirOrdenMatriz(){ // Función para pedirle al usuario el orden de la matriz y el valor inicial
        //variables

        Scanner dataTamanio = new Scanner(System.in);
        System.out.println("Ingrese un numero de orden de la matriz: ");
        tamano = dataTamanio.nextInt();

        System.out.println("Ingrese Valor inicial: ");
        valorInicial = dataTamanio.nextInt();
    }
    public static void main(String[] args) {

        pedirOrdenMatriz();

        int tamano2 = tamano;
        matriz = new int[tamano][tamano];

        //valorInicial = 1;
        int fila = 0;
        int columna = -1;
        int mover = 1;

        for (int i=0;i<tamano2;i++){
            for (int j=0; j<tamano; j++){
                columna = columna + mover;
                matriz[fila][columna] = valorInicial++;
            }
            tamano--;
            for (int j=0; j<tamano; j++){
                fila = fila +mover;
                matriz[fila][columna] = valorInicial++;
            }
            mover = mover * -1;
        }
        imprimirMatriz();
    }
    public static void imprimirMatriz(){ // Función para imprimir la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
