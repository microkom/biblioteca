/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
Las características comunes que se almacenan tanto para las revistas como
para los libros son:
 Código
 Título
 Año de publicación.
Estas tres características se pasan por parámetro en el momento de crear
los objetos.
 */
public abstract class Biblioteca {
    
    private String codigo;
    private String titulo;
    private int anyoPublicacion;
    
    public Biblioteca(String codigo, String titulo, int anyoPublicacion){
        this.titulo=titulo;
        this.codigo=codigo;
        this.anyoPublicacion=anyoPublicacion;
    }
    
    public String getTitulo(){return this.titulo;}
    public String getCodigo(){return this.codigo;}
    public int getAnyoPublicacion(){return this.anyoPublicacion;}
    
    public void setTitulo(String titulo){this.titulo=titulo;}
    public void setCodigo(String codigo){this.codigo=codigo;}
    public void setanyoPublicacion(int anyoPublicacion){this.anyoPublicacion=anyoPublicacion;} 
    
    
    
    public String toString(){
    String texto="";
    texto="\tCódigo: "+this.codigo+"\n"+
            "\tTítulo: "+this.titulo+"\n"+
            "\tAño Publicación: "+this.anyoPublicacion+"\n";
    return texto;
    }
}
