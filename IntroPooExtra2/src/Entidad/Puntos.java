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
public class Puntos {

    private static Scanner entrada = new Scanner(System.in);
    public double x1;
    public double y1;
    public double x2;
    public double y2;

    Puntos() {
    }

    public Puntos(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void cargar() {
        System.out.println("Ingrese los dos numeros para la coordenada x1 del primer punto: ");
        x1 = entrada.nextDouble();
        System.out.println("Ahora ingrese la coordenada y1: ");
        y1 = entrada.nextDouble();

        System.out.println("Ingrese los dos numeros para la coordenada x2 del primer punto: ");
        x2 = entrada.nextDouble();
        System.out.println("Ahora ingrese la coordenada y2");
        y2 = entrada.nextDouble();
    }

    public double calcular() {
        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2)));  //Math.sqrt es la raiz cuadrada.
        return distancia;
    }

    public void mostrar() {
        System.out.println("La distancia entre los dos puntos es: " + this.calcular());
    }
}
