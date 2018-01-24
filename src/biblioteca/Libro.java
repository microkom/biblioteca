/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**

Los libros tienen además un atributo prestado. 
* Los libros, cuando se crean, no están prestados.

 */
public class Libro extends Biblioteca implements Prestable{
    private boolean prestado;
    
    public Libro(String codigo, String titulo, int anyoPublicacion){
            super(codigo, titulo, anyoPublicacion);
            this.prestado=false;
    }
    
    public boolean getPrestado(){return this.prestado;}
    
    public void setPrestado(boolean prestado){this.prestado=prestado;}
    
    //comprobación de existencia de item en inventario
    public boolean existe(String nombre){
        boolean siExiste=false;
        if (super.getTitulo().equalsIgnoreCase(nombre)){
            siExiste=true;
        }
        return siExiste;
    }
    
    //marcar un libro como prestado
    public void prestar(){
        setPrestado(true);
    }
    
    //marcar un libro como devuelto
    public void devolver(){
        setPrestado(false);
    }
    
    //comprobar si el libro está prestado o no
    public boolean prestado(){
        boolean estado=false;
        if(getPrestado()){
            estado=true;
        }else{
            estado=false;
        }
        return estado;
    }
    
    //información completa del libro
    public String toString(){
        String texto=super.toString();
        if (this.prestado){
            texto+="\tLibro prestado\n";
        }else{
            texto+="\tLibro no prestado\n";
        }
        return texto;
    }
}
