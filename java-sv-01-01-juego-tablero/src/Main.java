

import java.util.IllegalFormatCodePointException;
import java.util.Random;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int filaYoda = 0;
        int columnaYoda = 0;
        char YODA = 'Y';
        // 1º) Yago
        char[][] matriz = new char[10][10];


        // 2º) Sergio
        int vidas = 10;
        // 3) Dani
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz.length; columna++) {
                matriz[fila][columna] = '*';
            }
        }
        matriz[filaYoda][columnaYoda] = YODA;
        // 4º) Carlos y Héctor
        //Alejandro


        char CASILLA_FINAL = 'F';
        matriz[9][9] = CASILLA_FINAL;


        //Marcos y Luis


        Random aleatorios = new Random();


        int filaRandom = aleatorios.nextInt(10);
        int columnaRandom = aleatorios.nextInt(10);


        matriz[filaRandom][columnaRandom] = 'M';


        //Alex


        int filaAleatoria2;
        int columnaAleatoria2;
       /*
       do {
           filaAleatoria2 = aleatorios.nextInt(10);
           columnaAleatoria2 = aleatorios.nextInt(10);
       } while (matriz[filaAleatoria2][columnaAleatoria2] !='*');
       matriz[filaAleatoria2][columnaAleatoria2] = 'P';
       */
        //Boris e Ikerr Se inserten 5 P


        for (int i = 0; i < 5; i++) {
            do {
                filaAleatoria2 = aleatorios.nextInt(10);
                columnaAleatoria2 = aleatorios.nextInt(10);
            } while (matriz[filaAleatoria2][columnaAleatoria2] != '*');
            matriz[filaAleatoria2][columnaAleatoria2] = 'P';
        }
        System.out.println();
        System.out.println();
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz.length; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println();
        }
        // Pablo


        System.out.println("Tu jugador se encuentra en la casilla 0,0");
        System.out.println("y te puedes desplazar con las letras W A S D");


        Scanner sc = new Scanner(System.in);


        do {
            System.out.print("Dime una letra: ");
            char desplazamiento = sc.next().charAt(0);


            //Yoel


            //Desplazamiento de YODA
            if (desplazamiento == 'D') {
                columnaYoda ++;

                System.out.println("Yoda se desplaza hacia la derecha");
            } else if (matriz[filaYoda][9] == YODA) {
                System.out.println("Cuidado!!! No te salgas del tablero");
            }




                if (desplazamiento == 'S') {
                    filaYoda --;
                    matriz[filaYoda][columnaYoda] = YODA;

                    System.out.println("Yoda se desplaza hacia abajo");
                } else if (matriz[9][columnaYoda] == YODA) {
                    System.out.println("Cuidado!!! No te salgas del tablero");
                }


            if (desplazamiento == 'W') {
                filaYoda --;
                matriz[filaYoda][columnaYoda] = YODA;

                System.out.println("Yoda se desplaza hacia arriba");
            } else if (matriz[0][columnaYoda] == YODA) {
                System.out.println("Cuidado!!! No te salgas del tablero");

            }

            if (desplazamiento == 'A') {
                columnaYoda ++;
                matriz[filaYoda][columnaYoda] = YODA;

                System.out.println("Yoda se desplaza hacia la izquierda");
            } else if (matriz[filaYoda][0] == YODA) {
                System.out.println("Cuidado!!! No te salgas del tablero");
            }




                   /* } else if (desplazamiento == 'W') {
                        System.out.println("Yoda se desplaza hacia arriba");
                        if ((filaYoda - 1) < 0) {
                            System.out.println("Cuidado!!! No te salgas del tablero");
                            filaYoda--;

                        }
                    }
                        filaYoda = filaYoda - 1;
                        matriz[filaYoda][columnaYoda] = YODA;
                    } else if (desplazamiento == 'A') {
                        System.out.println("Yoda se desplaza hacia la izquierda");
                        if ((columnaYoda - 1) < 0) {
                            System.out.println("Cuidado!!! No te salgas del tablero");
                            columnaYoda--;
                        }
                        columnaYoda = columnaYoda - 1;
                        matriz[filaYoda][columnaYoda] = YODA;
                    }

                    */


                    // Yoel
                    for (int fila = 0; fila < matriz.length; fila++) {
                        for (int columna = 0; columna < matriz[fila].length; columna++) {
                            System.out.print(matriz[fila][columna] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println("A Yoda le quedan " + vidas);


                }while (vidas != 0) ;


            }
        }

