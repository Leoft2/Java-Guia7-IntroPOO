/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio;


import Servicios.JuegoServicios;


public class MainExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      JuegoServicios j1 = new JuegoServicios();
      
      j1.crearJuego();
      j1.jugarJuego(j1);
      j1.mostrarJuego();
      
      
      
    }

}
 