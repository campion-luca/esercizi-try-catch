import exceptions.NumberNotInt;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Try catch");

        System.out.println("Esercizio 0");
        // nello svolgimento degli esercizi userò debugger con breakpoint.

        System.out.println("Esercizio 1");
        // istanzio l'array di 5 elementi ( int )
        int[] numbers = new int[5];

        // lo popolo di numeri random da 1 a 10
        for(int i = 0; i <numbers.length; i++) {
            numbers[i] = getRandomInt(11) ;
            System.out.println(numbers[i]); // con stampa annessa
        }
        System.out.println("vecchio array");


        // creo scanner per valore input da mettere nella posizione specifica (2)
        // con annesso ciclo per farlo all'infinito (fino alla pressione di 0).
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Inserisci un numero da 1 a 10: ");
            int subst = scanner.nextInt();
            try {
                numbers[3] = subst;

            } catch (NumberNotInt e) {
                System.out.println(e.getMessage());
            }

            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
            if (subst == 0) {
                break;
            }
            System.out.println("nuovo array");
        }



        }
        // metodo randomize Es. 1
        public static int getRandomInt(int max) {
        return (int) (Math.random() * max);
    }

}