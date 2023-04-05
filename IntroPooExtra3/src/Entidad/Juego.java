/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Leonel
 */
public class Juego {

    private static Scanner entrada = new Scanner(System.in);
    double num1;
    double num2;

    public Juego(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Juego() {
    }

    public void cargarnum1() {
        System.out.println("Jugador 1: ingresá el número del 1 al 10, sin que el jugador 2 lo vea: ");
        num1 = entrada.nextDouble();
    }

    public void iniciar_juego() {
        cargarnum1();
        int cont = 0;
        System.out.println("Jugador 2: ingresá un número del 1 al 10 para adivinar, tenes 3 intentos: ");
        while (cont != 3) {
            num2 = entrada.nextDouble();
            if (num2 == num1) {
                System.out.println("¡Adivinaste!");
                break;
            } else {
                cont++;
                System.out.println("Fallaste, tenes " + (3 - cont) + " intentos");
                if (num2 > num1) {
                    System.out.println("El número a adivinar es más bajo");
                } else {
                    System.out.println("El número a adivinar es más alto");
                }
            }
        }
        if (cont == 3) {
            System.out.println("Perdiste");
        }
    }
}
