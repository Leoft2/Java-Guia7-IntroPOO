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
public class Circunferencia {

    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia");
        radio = sc.nextDouble();

    }

    public double area(double radio) {
        double resultado;
        resultado = Math.PI * Math.pow(radio, 2);

        return resultado;

    }

    public double perimetro(double radio) {
        double resultado;
        resultado = 2 * Math.PI * radio;

        return resultado;

    }

}
