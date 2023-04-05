/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
Desarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá definir además dos constructores: uno vacío que inicializa el
título y el autor a cadenas vacías y otro que reciba como parámetros el
título y el autor de la canción. Se deberán además definir los métodos
getters y setters correspondientes.
 */
package MainE;

import Entidad.Cancion;
import java.util.Scanner;

public class MainExtra1 {

    /**
     * @param args the command line arguments
     */
    /*
    Desarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá definir además dos constructores: uno vacío que inicializa el
título y el autor a cadenas vacías y otro que reciba como parámetros el
título y el autor de la canción. Se deberán además definir los métodos
getters y setters correspondientes
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Cancion c1 = new Cancion();

        System.out.println("Ingrese el titulo");
        c1.setTitulo(leer.next());
        System.out.println("Ingrese el autor");
        c1.setAutor(leer.next());

        System.out.println("El titulo de la cancion es " + c1.getTitulo());
        System.out.println("El autor de la cancion es: " + c1.getAutor());

    }

}
