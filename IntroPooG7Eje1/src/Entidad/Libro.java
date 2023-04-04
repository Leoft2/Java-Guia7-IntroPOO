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
public class Libro {

    public String ISBN;
    public String titulo;
    public String autor;
    public int numeroDePaginas;

    public Libro(String ISBN, String Titulo, String Autor, int NumeroDePaginas) {
        this.ISBN = ISBN;
        this.titulo = Titulo;
        this.autor = Autor;
        this.numeroDePaginas = NumeroDePaginas;
    }

    public Libro() {
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String Titulo) {
        this.titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.autor = Autor;
    }

    public void setNumeroDePaginas(int NumeroDePaginas) {
        this.numeroDePaginas = NumeroDePaginas;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void cargarLibro() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el ISBN de su libro");
        ISBN = sc.nextLine();
        System.out.println("Ingrese el título de su libro");
        titulo = sc.nextLine();
        System.out.println("Ingrese el autor de su libro");
        autor = sc.nextLine();
        System.out.println("Ingrese el número de páginas de su libro");
        numeroDePaginas = sc.nextInt();
    }

    public void mostrarLibro() {
        System.out.println("ISBN= " + ISBN);
        System.out.println("Titulo= " + titulo);
        System.out.println("Autor= " + autor);
        System.out.println("Numero de paginas= " + numeroDePaginas);
    }

}
