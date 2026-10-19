import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //creo tablero
        char[][] tablero = new char[10][10];

        //relleno el tablero con *
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = '*';
            }
        }

        //creo a nuestro personaje
        char JUGADOR = 'J';
        tablero[0][0] = JUGADOR;

        //coloco un Tesoro en una posicion aleatoria sin repetir casilla
        Random random = new Random();
        int filaAleatoria;
        int columnaAleatoria;

        do {
            filaAleatoria = random.nextInt(10);
            columnaAleatoria = random.nextInt(10);
        }while (tablero[filaAleatoria][columnaAleatoria] != '*');
        tablero[filaAleatoria][columnaAleatoria] = 'T';

        //coloco 10 muros aleatorias sin repetir casillas
        for (int i = 0; i < 10; i++) {
            do {
                filaAleatoria = random.nextInt(10);
                columnaAleatoria = random.nextInt(10);
            }while (tablero[filaAleatoria][columnaAleatoria] != '*');
            tablero[filaAleatoria][columnaAleatoria] = 'M';

        }

        //colocar 8 bombas aleatorias sin repetir casillas
        for (int i = 0; i < 8; i++) {
            do {
                filaAleatoria = random.nextInt(10);
                columnaAleatoria = random.nextInt(10);
            }while(tablero[filaAleatoria][columnaAleatoria] != '*');
            tablero[filaAleatoria][columnaAleatoria] = 'B';
        }



        //muestro el tablero
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j] +" ");
            }
            System.out.println();
        }

        //Mover nuestro jugador con W A S D
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mueve tu jugador 'J' con W A S D");
        char desplazamiento = scanner.next().charAt(0);

        System.out.println("La letra elegida es " + desplazamiento);

        int filaJ = 0;
        int columnaJ = 0;

        if (desplazamiento == 'W') {
            filaJ--;
        } else if (desplazamiento == 'A') {
            columnaJ--;
        } else if (desplazamiento == 'S') {
            filaJ++;
        } else if (desplazamiento == 'D') {
            columnaJ++;
        } else {
            System.out.println("Movimiento no valido");
        }



    }
}