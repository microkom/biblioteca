/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
Las revistas tienen un número. En el momento de crear las revistas se pasa
el número por parámetro.
 */
public class Revista extends Biblioteca{
    private int numero;
    
    public Revista(String codigo, String titulo, int anyoPublicacion, int numero){
            super(codigo, titulo, anyoPublicacion);
            this.numero=numero;
    }
    
    public int getNumero(){return this.numero;}
    
    public void setNumero(int numero){this.numero=numero;}
    
    public String toString(){
        String texto=super.toString();
        texto+="\tNúmero revista: "+this.numero+"\n";
        return texto;
    }
}
