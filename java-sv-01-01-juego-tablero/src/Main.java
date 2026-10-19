import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][] matriz = new char[10][10];

        int vidas = 10;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = '*';

            }
        }



        char YODA = 'Y';
        matriz[0][0] = YODA;

        char FINAL = 'F';
        matriz[9][9] = FINAL;

        Random random = new Random();

        int filaAleatoria = random.nextInt(10);
        int columnaAleatoria = random.nextInt(10);

        matriz[filaAleatoria][columnaAleatoria] = 'M';

        int filaAleatoria2 = random.nextInt(10);
        int columnaAleatoria2 = random.nextInt(10);

        matriz[filaAleatoria2][columnaAleatoria2] = 'P';




        for (int i = 0; i < 5; i++) {
                do {
                    int filaAleatoria3 = random.nextInt(10);
                    int columnaAleatoria3 = random.nextInt(10);
                } while (matriz[filaAleatoria2][columnaAleatoria2] != '*');
                matriz[filaAleatoria2][columnaAleatoria2] = 'P';


        }



        System.out.println("Tu jugador se encuentra en la casilla 0,0");
        System.out.println("Y te puedes desplazar con las letras W A S D");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime una letra");
        char desplazamiento = scanner.next().charAt(0);

        System.out.println("La letra elegida es " + desplazamiento);

        int filaYoda = 0;
        int columnaYoda = 0;

        matriz[filaYoda][columnaYoda] = YODA;

        if (desplazamiento == 'D'){
            columnaYoda = columnaYoda + 1;
            matriz[filaYoda][columnaYoda] = YODA;
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }



    }
}