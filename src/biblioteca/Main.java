/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author DAW
 */
public class Main {

    /**
     * En la clase que contiene el método main se debe crear un vector de al
     * menos 10 posiciones que contenga libros y revistas. En el método main se
     * debe listar la información de todos las publicaciones así como el total
     * de libros y revistas publicadas en el año actual y los libros actualmente
     * prestados. Antes de ellos se realizarán llamadas a los métodos
     * anteriormente creados para comprobar que funcionan correctamente.
     */
    public static void main(String[] args) {
        Biblioteca[] publicacion = new Biblioteca[10];

        publicacion[0] = new Libro("abc123", "El olor de la papaya verde", 2005);
        publicacion[1] = new Libro("abc124", "Four after Dark", 2018);
        publicacion[2] = new Libro("abc125", "The dead zone", 1985);
        publicacion[3] = new Libro("abc126", "The langoloids", 2018);
        publicacion[4] = new Libro("abc127", "Tomates verdes fritos", 1985);
        publicacion[5] = new Revista("abc145", "Popular Mechanics", 1975, 1254);
        publicacion[6] = new Revista("abc245", "Action movies", 2005, 1254);
        publicacion[7] = new Revista("abc345", "News Week", 2018, 1254);
        publicacion[8] = new Revista("abc445", "Science today", 1981, 1254);
        publicacion[9] = new Revista("abc545", "Doctors inc", 2018, 1254);

        int revistasPublicadas=0;
        int librosPublicados=0;
        int librosPrestados=0;
        
        ((Libro)publicacion[3]).prestar();
        ((Libro)publicacion[4]).prestar();
        ((Libro)publicacion[1]).prestar();
        ((Libro)publicacion[0]).prestar();
        ((Libro)publicacion[3]).devolver();
        
        for (int i = 0; i < publicacion.length; i++) {
            if (publicacion[i] instanceof Libro) {
                if (((Libro)publicacion[i]).prestado()){
                    librosPrestados++;
                }
                if (((Libro)publicacion[i]).getAnyoPublicacion()==2018){
                    librosPublicados++;
                }
                System.out.println(publicacion[i].toString());
            }
            if (publicacion[i] instanceof Revista){
                if (((Revista)publicacion[i]).getAnyoPublicacion()==2018){
                    revistasPublicadas++;
                }
                System.out.println(publicacion[i].toString());
            }
        }
        
        System.out.println("\tLibros Publicados:"+librosPublicados);
        System.out.println("\tLibros Prestados:"+librosPrestados);
        System.out.println("\tRevistas Publicadas:"+revistasPublicadas);

    }

}
